namespace SnakeGame
{
    internal class Program
    {
        static void Main(string[] args)
        {

            GameSystem gameSystem=GameSystem.GetInstance();
            gameSystem.Start();


        }

    }
}