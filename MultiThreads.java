public class MultiThreads implements Runnable
{
    private int bugs;
    private int addOrRemove;
    private Warehouse inv;

    public MultiThreads(int aOr, int b, Warehouse invW)
    {
        addOrRemove = aOr;
        bugs = b;
        inv = invW;
    }

    public void run()
    {
        if (bugs == 0)
        {
            if (addOrRemove == 0)
            {
                inv.add();
            }

            if (addOrRemove == 1)
            {
                inv.sub();
            }
        }

        if (bugs == 1)
        {
            try{

                if (addOrRemove == 0)
                {
                    int invamt = inv.getInvAmt();
                    Thread.sleep(1000);
                    inv.addUnsync(invamt);
                }

                if (addOrRemove == 1)
                {
                    int invamt = inv.getInvAmt();
                    Thread.sleep(1000);
                    inv.subUnsync(invamt);
                }
                
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        }
        if (addOrRemove == 2)
        {
            System.out.println("Final Inventory size: " + inv.getInvAmt());
        }

    }

}