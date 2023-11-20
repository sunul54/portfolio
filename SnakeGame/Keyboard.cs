using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace SnakeGame
{

    /// <summary>
    /// 싱글톤 패턴 (디자인패턴)  (설계 패턴)
    /// </summary>
    public class Keyboard
    {
        public ConsoleKeyInfo keyInfo;      // 클래스안에 있는 변수 = 필드, 속성 (클래스 속성)

        /// <summary>
        /// 생성자
        /// Keyboard keyboard = new KeyBoard();
        /// </summary>
        private Keyboard()
        {
            Thread keyboardThread = new Thread(InputKeyboardKey);
            keyboardThread.Start();
        }

        // instance => 객체
        private static Keyboard instance = null;

        private static readonly object lock_object = new object();

        // Thread Safety한 싱글톤 패턴
        public static Keyboard GetInstance()
        {
            if (instance == null)
            {
                // lock의 의미 다른 스레드가 동시에 접근을 할 때 하나의 쓰레드만 접근 허용한다.
                lock (lock_object)
                {
                    // null == 아무것도 없다.
                    if (instance == null)
                    {
                        instance = new Keyboard();
                    }
                }
            }

            return instance;
        }

        public void InputKeyboardKey()
        {
            while (true)
            {
                keyInfo = Console.ReadKey();
                Thread.Sleep(20);      // 20ms 재워주기.  CPU 사용량, Sleep 사용안하고 그냥 사용하게되면 CPU 사용량이 증가되요
            }
        }
    }
}
