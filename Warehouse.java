public class Warehouse
{
    public int amnt = 0;

    public synchronized void add()
    {
        amnt = amnt + 1;
        System.out.println("Added. Inventory size = " + amnt);
    }

    public void addUnsync(int invamt)
    {
        invamt = invamt + 1;
        System.out.println("Added. Inventory size = " + invamt);
    }

    public synchronized void sub()
    {
        amnt = amnt - 1;
        System.out.println("Removed. Inventory size = " + amnt);
    }

    public void subUnsync(int invamt)
    {
        invamt = invamt - 1;
        System.out.println("Removed. Inventory size = " + invamt);
    }

    public int getInvAmt()
    {
        return amnt;
    }

    public void setInvAmt(int u)
    {
        amnt = u;
    }
}
