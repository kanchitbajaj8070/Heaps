import java.util.ArrayList;

public class BinaryHeap {
ArrayList<Integer> data= new ArrayList<>();

    public int left( int i)
    {
        int ans=2*i+1;
        if(ans<data.size())
            return ans;
        else
            return -1;
    }
    public int right( int i)
    { int ans=2*i+2;
    if(ans<data.size())
        return ans;
    else
        return -1;
    }
    public int parent(ArrayList<Integer>a,int i)
    {int ans=(i-1)/2;
        if(ans>=0)
            return ans;
        else
            return -1;
    }

    public void insert( int item )
    {
        data.add(item);
        upheapify( data,data.size()-1);
        System.out.println(data);
    }

    private void upheapify( ArrayList<Integer> data, int i) {


        if (i < data.size() && i >= 1) {
            int p = (i-1)/2;
            if (data.get(p) > data.get(i)) {
                swap(p,i);
            upheapify(data, p);
        }
        }
    }
    public void swap(int i, int j)
    {
        int c=data.get(i);
        data.set(i,data.get(j));
        data.set(j,c);
    }
public int remove( )
{
    int ans=data.get(0);
    swap(0,data.size()-1);
    data.remove(data.size()-1);
    downheapify( 0);
    System.out.println(data);
    return ans;
}

    private void downheapify(int i) {
        int smallest=i;
        int key=data.get(i);
        if(left(i)!=-1&&data.get(left(i))<data.get(i))
        {
            smallest=left(i);
        }
        if(right(i)!=-1&&data.get(right(i))<data.get(i))
        {
            smallest=right(i);
        }
        swap(smallest,i);
        if(smallest!=i)
            downheapify(smallest);

    }
}
