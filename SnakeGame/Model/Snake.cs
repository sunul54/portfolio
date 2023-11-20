using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SnakeGame.Model
{
    public class Snake
    {
        public enum Direction
        {
            위쪽, 아래쪽, 왼쪽, 오른쪽
        }

        public Point nowPosition = new Point(5, 5);      // x : 5, y : 5

        // 자료구조: 덱  (스택 :넣은것을 뒤로빼는것 + 큐 :앞으로 빼는 것) 
        public List<Point> tails = new List<Point>();

        // 방향
        Direction direction = Direction.위쪽;
         public Direction SnakeDirection
        {
            get
            {
                return direction;
            }
            set
            {
                direction = value;
            }
        }

        //Map map;

        public Snake()
        {

            //map = Map.GetInstance();        // 유일무이한 하나의 객체를 접근
        }

        public void Start()
        {
            nowPosition = new Point(5, 5);
            tails = new List<Point>();
        }

        public void Update()
        {
            
        }
        public void Move()
        {
            int y = nowPosition.y;
            int x = nowPosition.x;


            if ((SnakeDirection == Snake.Direction.위쪽))
            {
                // 만약에 이동이 가능하다면, 좌표 
              
                nowPosition.y = y - 1;
  
            }
            else if ((SnakeDirection == Snake.Direction.오른쪽))
            {
                // 만약에 이동이 가능하다면, 좌표 
          
                nowPosition.x = x + 1;
            }
            else if ((SnakeDirection == Snake.Direction.아래쪽))
            {
                // 만약에 이동이 가능하다면, 좌표 
                nowPosition.y = y + 1;

            }
            else if ((SnakeDirection == Snake.Direction.왼쪽))
            {
                // 만약에 이동이 가능하다면, 좌표 이동
                nowPosition.x = x - 1;

            }
        }

        public void DeleteTail()
        {
            tails.RemoveAt(0);
        }

        public void EatApple()
        {
            tails.Add(new Point(nowPosition .x, nowPosition.y));
        }


    }
}
