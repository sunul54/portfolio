using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Cs
{
    internal class Teacher : people
    {
        public Teacher (string name, int age, string adress)
        {
            this.name = name;
            this.age = age;
            this.address= adress;
        }
        public int workingTime = 0;


        public void Teach(Classroom room)
        {
            room.IncresesScore();

        }
    }
}
