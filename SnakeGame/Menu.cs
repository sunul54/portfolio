using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SnakeGame
{
    internal class Menu
    {
        private enum menuColors
        {
            RED,
            BLUE,
            GREEN,
            WHITE
        }
        private menuColors menuColor = menuColors.WHITE;

        private int ColorIndex = 0;

        public void ShowMenu()
        {
             ChangeColor();
            Console.WriteLine("============================");
            Console.WriteLine("|                          |");
            Console.WriteLine("|        Snake Game        |");
            Console.WriteLine("|                          |");
            Console.WriteLine("|                          |");
            Console.WriteLine("|         Made By          |");
            Console.WriteLine("|          선율            |");
            Console.WriteLine("|                          |");
            Console.WriteLine("|       1. GameStart       |");
            Console.WriteLine("|       2. Quit            |");
            Console.WriteLine("|                          |");
            Console.WriteLine("|                          |");
            Console.WriteLine("============================");
        }
        public void ChangeColor()
        {
            ColorIndex = (ColorIndex + 1) % 4;
            menuColor = (menuColors)ColorIndex;
            if(menuColor == menuColors.RED)
            {
                Console.ForegroundColor= ConsoleColor.Red;
            }else if(menuColor == menuColors.BLUE)
            {
                Console.ForegroundColor= ConsoleColor.Blue;
            }else if(menuColor == menuColors.GREEN)
            {
                Console.ForegroundColor= ConsoleColor.Green;
            }else if(menuColor == menuColors.WHITE)
            {
                Console.ForegroundColor= ConsoleColor.White;
            }
        }
    }
}
