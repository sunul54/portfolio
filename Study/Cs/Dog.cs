using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cs
{
    internal class Dog : lEat
    {
        public string name;
        public int age;

        public Dog(string name, int age)
        {
            this.name = name;
            this.age = 20;
        }
        public void Eat()
        {
            Console.WriteLine($"멍멍이 {name}은 밥을 먹습니다");
        }
    }
}
