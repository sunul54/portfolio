using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pattern
{
    internal class singleton
    {
        int number = 0;
        private singleton()
        {

        }

        private static readonly object lock_object = new object();

        private static singleton instance = null;
        public static singleton GetInstance()
        {
            if (instance == null)
            {
                lock (lock_object)
                {
                    if (instance == null)
                    {
                        instance = new singleton();
                    }
                }
            }

            return instance;
        }
        public void IncreaseNumber()
        {
            number++;
        }
        public void PrintNumber()
        {
            Console.WriteLine($"현제 number의 수는 {number} 입니다.");
        }
    }
}
