using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cs
{
    public class Classroom
    {
        List<Student> students;

        public Classroom()
        {
            students = new List<Student>();
        }

        ~Classroom()
        {
            Console.WriteLine("소멸자 호출");
        }
        public void Enroll(Student student)
        {
            students.Add(student);
        }

        public void IncresesScore()
        {
            foreach(var student in students)
            {
                student.kor += 5;
                student.eng += 5;
                student.math += 5;

            }
        }
        public void DoTest()
        {
            foreach(var student in students)
            {
                 student.ReadData();
            }
        }
        public void Print()
        {
            double korTotal = 0;
            double engTotal = 0;
            double mathTotal = 0;

            foreach (var student in students)
            {
                student.Print();
                korTotal += student.kor;
                engTotal += student.eng;
                mathTotal += student.math;
            }

            double avgKorea = korTotal / students.Count;
            double avgEng = engTotal / students.Count;
            double avgMath = mathTotal / students.Count;
            Console.WriteLine($"이 방의 국어 평균 : {korTotal} 영어 평균 : {engTotal} 수학 평균 : {mathTotal}");
        }
    }
}
