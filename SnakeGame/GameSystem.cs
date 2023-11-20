using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace SnakeGame
{
    public class GameSystem
    {

        private GameSystem()
        {

        }

        private static GameSystem instance;

        private static object lock_object = new object();
        /// <summary>
        /// 싱글턴 패턴  : 이 프로그램에서는 단 하나의 객체만 존재할 수밖에 없게 만듬.
        /// </summary>
        /// <returns></returns>
        public static GameSystem GetInstance()
        {
            if (instance == null)
            {
                lock (lock_object)
                {
                    if (instance == null)
                    {
                        instance = new GameSystem();
                    }
                }
            }

            return instance;
        }

        /// <summary>
        /// 열거형 (열거형에서 정의되는 값을 0부터 N까지 정수형으로 표현해주는 구조체)
        /// </summary>
        public enum State
        {
            Menu, GameMode, Exit, GameOver
        }

        /// <summary>
        /// 현재 GameSystem의 상태 
        /// </summary>
        private State nowState = State.Menu;

        // Setter, Getter 패턴
        public State NowState
        {
            set
            {
                nowState = value;
            }
            get
            {
                return nowState;
            }
        }

        public void Start()
        {
            Menu menu = new Menu();
            Keyboard keyboard = Keyboard.GetInstance();
            GameAlgorithm algorithm = new GameAlgorithm();
            algorithm.Start();

            //GameAlgorithm algorithm = new GameAlgorithm();
            while (true)
            {
                // 현재 GameSystem의 상태가 Menu 상태일 때 Menu를 보여주겠다.
                if (nowState == State.Menu)
                {
                    menu.ChangeColor();
                    menu.ShowMenu();
                    Thread.Sleep(300);
                    Console.Clear();

                    if (keyboard.keyInfo.Key == ConsoleKey.D1)
                    {
                        nowState = State.GameMode;
                    }
                    else if (keyboard.keyInfo.Key == ConsoleKey.D2)
                    {
                        nowState = State.Exit;
                    }
                }
                else if (nowState == State.GameMode)    // 진짜 게임
                {
                    algorithm.Update();
                }
                else if (nowState == State.Exit)    // 나가기
                {
                    System.Environment.Exit(0);
                }
                else if (nowState == State.GameOver)
                {
                    algorithm.Start();
                    nowState = State.Menu;
                    keyboard.keyInfo = new ConsoleKeyInfo();
                }

            }
        }
    }
}
