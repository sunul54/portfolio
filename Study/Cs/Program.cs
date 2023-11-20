using System.Security.Cryptography;

namespace Cs
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //Classroom room1 = new Classroom();
            //Classroom room2 = new Classroom();

            //Console.Write("1반에 몇명을 넣을지 입력해주세요.");
            //int room1Number = Int32.Parse(Console.ReadLine());

            //for(int i = 0; i < room1Number; i++)
            //{
            //    Student s1 = new Student();
            //    s1.ReadPeopleStatus();
            //    room1.Enroll(s1);
            //}


            //room1.DoTest();



            //room1.Print();

            //Console.Write("2반에 몇명을 넣을지 입력해주세요.");
            //int room2Number = Int32.Parse(Console.ReadLine());

            //for (int i = 0; i < room2Number; i++)
            //{
            //    Student s1 = new Student();
            //    s1.ReadPeopleStatus();
            //    room2.Enroll(s1);
            //}

            //room2.DoTest();



            //room2.Print();

            //Teacher teacher = new Teacher("홍영주", 30, "기흥구");
            //teacher.Teach(room1);
            //teacher.Teach(room2);

            //room1.Print();
            //room2.Print();

            Student s1 = new Student();
            s1.ReadPeopleStatus();
            s1.Eat();
            Dog dog = new Dog("해피", 1);
            dog.Eat();

            List<lEat> objects = new List<lEat>();
            objects.Add(s1);
            objects.Add(dog);

            foreach(lEat eater  in objects)
            {
                eater.Eat();
            }

        }
    }
}