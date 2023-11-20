using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cs
{
    public class Student : people 
    {
        
        public int kor;
        public int math;
        public int eng;

        public Student(string name, int age, string address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void Print()
        {
            //base.Print();
            Console.WriteLine($"{name}의 국어 : {kor} 수학: {math} 영어 : {eng}");
        }

        public Student()
        {

        }
           public void ReadData()
        {
            //base.ReadData();
            Console.Write($"{name}국어의 성적을 입력해주세요");
            string skor = Console.ReadLine();
            kor = Int32.Parse(skor);
            
            Console.Write($"{name}수학의 성적을 입력해주세요");
            string sMath = Console.ReadLine();
            math = Int32.Parse(sMath);

            Console.Write($"{name}국어의 성적을 입력해주세요" );
            string seng = Console.ReadLine();
            eng = Int32.Parse(seng);

        }
    }
}
