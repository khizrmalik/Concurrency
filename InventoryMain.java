public class InventoryMain
{
    public static void main(String[] args) throws InterruptedException
    {
        try{

            int addedItems = Integer.parseInt(args[0]);
            int removedItems = Integer.parseInt(args[1]);
            int bug = Integer.parseInt(args[2]);

            Warehouse inv = new Warehouse();

            Thread[] AllThreads = new Thread[addedItems + removedItems];

            MultiThreads mt1 = new MultiThreads(0, bug, inv);
            MultiThreads mt2 = new MultiThreads(1, bug, inv);
            MultiThreads mt3 = new MultiThreads(2, bug, inv);

            for (int i = 0; i < AllThreads.length; i++)
            {
                if (i < addedItems)
                {
                    AllThreads[i] = new Thread(mt1);
                }
                else
                {
                    AllThreads[i] = new Thread(mt2);
                }
                AllThreads[i].start();
            }

            for (int i = 0; i < AllThreads.length; i++)
            {
                AllThreads[i].join();
            }

            Thread t3 = new Thread(mt3);
            t3.start();
        }
        catch(Exception e){

        }  
    } 
}
