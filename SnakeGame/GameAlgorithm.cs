using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using SnakeGame.Model;

namespace SnakeGame
{
    /// <summary>
    /// Snake게임의 전반적인 로직을 담당하는 클래스
    /// </summary>
    public class GameAlgorithm
    {
        public GameAlgorithm()
        {

        }

        /// <summary>
        /// Snake의 모델 객체
        /// </summary>
        Snake snake = new Snake();
        Map map = Map.GetInstance();

        Keyboard keyboard = Keyboard.GetInstance();

        MusicManager musicManager = MusicManager.GetInstance();

        int score = 0;
        /// <summary>
        /// GameAlgorithm이 생성이 되었을 때 초기로 실행되는 메소드
        /// </summary>
        /// 

        public void Start()
        {

            snake.Start();
            map.Start();
            map.MakeApple();
            musicManager.PlayBackgroundMusic();

            score = 0;
        }

        /// <summary>
        /// 1Tick마다 실행되는 메소드
        /// </summary>
        public void Update()
        {

            Point snakeBeforePosition = snake.nowPosition;
            map.nowMap[snakeBeforePosition.y, snakeBeforePosition.x] = Map.ObjectClass.Blank;

            SnakeChangeDirection();

            SnakeMove();

            Point snakeNowPosition = snake.nowPosition;
            //Map.MapCopy(map.nowMap, map.originalMap);
            //Map.MapCopy(map.nowMap, map.objectMap);
            map.nowMap[snakeNowPosition.y, snakeNowPosition.x] = Map.ObjectClass.Snake;

            foreach(Point p in snake.tails)
            {

                map.nowMap[p.y, p.x] = Map.ObjectClass.Snake;
            }




            map.PrintMap();

            printScore();

            Thread.Sleep(300);
            Console.Clear();
        }

        private void printScore()
        {
            Console.WriteLine($"점수 : {score}");
        }

        private void SnakeChangeDirection()
        {
            if (keyboard.keyInfo.Key == ConsoleKey.UpArrow)
            {
                snake.SnakeDirection = Snake.Direction.위쪽;
            }
            else if (keyboard.keyInfo.Key == ConsoleKey.RightArrow)
            {
                snake.SnakeDirection = Snake.Direction.오른쪽;
            }
            else if (keyboard.keyInfo.Key == ConsoleKey.DownArrow)
            {
                snake.SnakeDirection = Snake.Direction.아래쪽;
            }
            else if (keyboard.keyInfo.Key == ConsoleKey.LeftArrow)
            {
                snake.SnakeDirection = Snake.Direction.왼쪽;
            }
        }
        private void SnakeMove()
        {
            int y = snake.nowPosition.y;
            int x = snake.nowPosition.x;
            bool isGameOver = true;
            bool isEating = false;
            if ((snake.SnakeDirection == Snake.Direction.위쪽)&&(map.IsValidPosition(x, y - 1)))
            {
                if(map.IsApple(x, y - 1))
                {
                    isEating = true;
                }
                // 만약에 이동이 가능하다면, 좌표 
                snake.EatApple();
                
                snake.Move();
                isGameOver = false;
            }
            else if ((snake.SnakeDirection == Snake.Direction.오른쪽)&&(map.IsValidPosition(x + 1, y)))
            {
                if (map.IsApple(x+1, y ))
                {
                    isEating = true;
                }
                // 만약에 이동이 가능하다면, 좌표 
                snake.EatApple();
                snake.Move();
                isGameOver = false;
            }
            else if ((snake.SnakeDirection == Snake.Direction.아래쪽) && (map.IsValidPosition(x, y + 1)))
            {
                if (map.IsApple(x, y + 1))
                {
                    isEating = true;

                }
                // 만약에 이동이 가능하다면, 좌표 
                snake.EatApple();
                snake.Move();
                isGameOver = false;   
            }
            else if ((snake.SnakeDirection == Snake.Direction.왼쪽) && (map.IsValidPosition(x - 1, y)))
            {
                if (map.IsApple(x-1, y))
                {
                    isEating = true;
                }
                // 만약에 이동이 가능하다면, 좌표 이동
                snake.EatApple();
                snake.Move();
                    isGameOver = false;

            }

            if(!isEating)
            {
                if(snake.tails.Count >0)
                {
                    Point beforeTail = snake.tails[0];
                    map.nowMap[beforeTail.y, beforeTail.x] = Map.ObjectClass.Blank;
                    snake.DeleteTail();
                }
                
            }
            else
            {
                map.MakeApple();
                musicManager.PlayEatingMusic();

                score += 10;
            }
            if (isGameOver)
            {
                GameSystem.GetInstance().NowState = GameSystem.State.GameOver;
                musicManager.PlayGameovermusic();
            }
                
        }
    }
}