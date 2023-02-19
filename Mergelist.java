class MergeList{
    static node h1 = null;
    static node h2 = null;
    static class node
    {
    int d;
    node next;
    };
    static void setData(node head)
    {
    node temp;
    temp = head;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    }
    static node getData(node head, int num)
    {
    node temp = new node();
    node tail = head;
    temp.data = num;
    temp.next = null;
    if (head == null)
    {
        head = temp;
        tail = temp;
    }
    else
    {
        while (tail != null)
        {
        if (tail.next == null)
        {
            tail.next = temp;
            tail = tail.next;
        }
        tail = tail.next;
        }
    }
    return head;
    }
    static node mergelists()
    {
    node tail = h1;
    while (tail != null)
    {
        if (tail.next == null &&
            h2 != null)
        {
        tail.next = h2;
        break;
        }
        tail = tail.next;
    }
    return h1;
    }
    
    static void sortlist()
    {
    node curr = h1;
    node temp = h1;
    while (curr.next != null)
    {
        temp = curr.next;
        while (temp != null)
        {
        if (temp.data < curr.data)
        {
            int t = temp.data;
            temp.data = curr.data;
            curr.data = t;
        }
        temp = temp.next;
        }
        curr = curr.next;
    }
    }
    

    public static void main(String[] args)
    {
    
    hd1 = getData(h1, 25);
    hd1 = getData(h1, 35);
    hd1 = getData(h1, 12);
    hd1 = getData(h1, 4);
    hd1 = getData(h1, 36);
    hd1 = getData(h1, 48);
    
    hd2 = getData(hd2,8 );
    hd2 = getData(hd2, 32);
    hd2 = getData(hd2, 22);
    hd2 = getData(hd2, 45);
    hd2 = getData(hd2,63 );
    hd2 = getData(hd2, 49);
    hd1 = mergelists();
    sortlist();
    setData(h1);
    }
  }
}