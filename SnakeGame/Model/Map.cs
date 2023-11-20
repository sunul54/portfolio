using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SnakeGame.Model
{
    public class Map
    {

        private Map()
        {
            Start();
        }

        private static Map instance;

        private static object lock_object = new object();
        // 싱글톤 패턴 = 이 프로그램에서 Map 객체는 유일무이한 하나의 객체가 된다.

        public static Map GetInstance()
        {
            if (instance == null)
            {
                lock (lock_object)
                {
                    if (instance == null)
                    {
                        instance = new Map();
                    }
                }
            }

            return instance;
        }

        /// <summary>
        /// 객체 분류 열거형
        /// </summary>
        public enum ObjectClass
        {
            Blank, Wall, Snake, Apple
        }

        //public ObjectClass[,] originalMap = new ObjectClass[10, 10];       // 초기값만 저장하고 있는 맵
        //public ObjectClass[,] lastMap = new ObjectClass[10, 10];       // 이전의 맵
        public ObjectClass[,] nowMap = new ObjectClass[10, 10];       // 현재의 맵
        //public ObjectClass[,] objectMap = new ObjectClass[10, 10];

        public void Start()
        {
            nowMap = new ObjectClass[10, 10];
            // 맵 초기화
            for (int i = 0; i < 10; i++)
            {
                nowMap[i, 0] = ObjectClass.Wall;
                nowMap[i, 9] = ObjectClass.Wall;
                nowMap[0, i] = ObjectClass.Wall;
                nowMap[9, i] = ObjectClass.Wall;
            }
            //nowMap = originalMap;         // 주소값이 대입이 될 것입니다.
            
            
            
            //MakeApple();
        }
        public void MakeApple()
        {
            while (true)
            {
                Random random = new Random();
                int randX = random.Next(10);
                int randY = random.Next(10);

                if (nowMap[randY, randX] == ObjectClass.Blank)
                {
                    nowMap[randY, randX] = ObjectClass.Apple;
                    break;
                }

            }
        }
        public void AddMaplayer(ObjectClass[,] target, ObjectClass[,] copy)
        {
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    
                }
            }
        }
       


        /// <summary>
        /// 맵을 카피하는 메소드
        /// </summary>
        /// <param name="origin">카피 대상</param>
        /// <param name="copy">카피 참조 객체</param>
        public static void MapCopy(ObjectClass[,] origin, ObjectClass[,] copy)
        {
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    origin[i, j] = copy[i, j];
                }
            }
        }

        public void PrintMap()
        {
            // 맵 출력
            for (int i = 0; i < 10; i++)
            {
                for (int j = 0; j < 10; j++)
                {
                    if (nowMap[i, j] == ObjectClass.Blank)
                    {
                        Console.Write("  ");
                    }
                    else if (nowMap[i, j] == ObjectClass.Wall)
                    {
                        Console.Write("■");
                    }
                    else if (nowMap[i, j] == ObjectClass.Apple)
                    {
                        Console.Write("★");
                    }
                    else if (nowMap[i, j] == ObjectClass.Snake)
                    {
                        Console.Write("●");
                    }
                }
                Console.WriteLine();
            }
        }

        public void Update()
        {

        }

        public bool IsValidPosition(int x, int y)
        {
            // 배열의 범위를 초과할 경우에는 false 즉 게임오버
            if (x < 0 || x > 9 || y < 0 || y > 9)
            {
                return false;
            }

            // 벽에 부딪히거나, 자기 자신을 접근할 때 게임오버
            if (nowMap[y, x] == ObjectClass.Wall || nowMap[y, x] == ObjectClass.Snake)
            {
                return false;
            }

            return true;
        }


        public bool IsApple(int x, int y)
        {
            return nowMap[y,x] == ObjectClass.Apple;
            //
            //return nowMap[y,x] == ObjectClass.Apple ? true : false;


            /*if (nowMap[y, x] == ObjectClass.Apple) return true;
            return false;*/
        }
    }
}
