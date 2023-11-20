namespace pattern
{
    internal class Program
    {
        static void Main(string[] args)
        {
            singleton Object1 = singleton.GetInstance();

            singleton Object2 = singleton.GetInstance();

            Object1.IncreaseNumber();
            Object1.PrintNumber();

            Object2.IncreaseNumber();
            Object2.PrintNumber();

            Thread t1 = new Thread(Function);
            Thread t2 = new Thread(Function);
            t1.Start();
            t2.Start();

        }
        private static void Function()
        {
            singleton object1 = singleton.GetInstance();

            for(int i = 0; i <= 100000; i++)
            {
                singleton Object1 = singleton.GetInstance();
                Object1.IncreaseNumber();
            }
            singleton Obj = singleton.GetInstance();
            Obj.PrintNumber();
        }
    }
}