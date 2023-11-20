using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Cs
{
    public struct People2
    {
        public string name;
        public int age;
        public string address;

    }
    public abstract class people : lEat
    {
        protected string name;
        protected int age;
        protected string address;
        private void Print()
        {

            Console.WriteLine($"이름 : {name} 나이: {age} 주소 : {address}");
        }
        public void ReadPeopleStatus()
        {
            Console.WriteLine("이름을 입력해주세요");
            name = Console.ReadLine();

            Console.WriteLine("나이를 입력해주세요");
            string sAge = Console.ReadLine();
            age = Int32.Parse(sAge);

            Console.WriteLine("주소를 입력해주세요");
            address = Console.ReadLine();

        }
        public void Eat()
        {
            Console.WriteLine($"{name}은 밥을 먹습니다");
        }
    }
}
