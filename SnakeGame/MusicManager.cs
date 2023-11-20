using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WMPLib;

namespace SnakeGame
{
    public class MusicManager
    {
        WindowsMediaPlayer backgroundMusicplayer = new WindowsMediaPlayer();
        WindowsMediaPlayer coinMusicplayer = new WindowsMediaPlayer();
        WindowsMediaPlayer gameoverMusicplayer = new WindowsMediaPlayer();
        private const string backgroundURL = "D:\\Visual Studio\\Cs\\SnakeGame\\Music\\background.mp3";

        private const string coinURL = "D:\\Visual Studio\\Cs\\SnakeGame\\Music\\coin.mp3";

        private const string GameoverURL = "D:\\Visual Studio\\Cs\\SnakeGame\\Music\\Gameover.mp3";
        private MusicManager()          
        {

        }

        public static  MusicManager GetInstance()
        {

            if(_instance == null)
            { 
                lock (_lock)
                {
                    if (_instance == null)                     {
                        _instance = new MusicManager();
                    }

                }
            }

            return _instance;
        }

        private static MusicManager _instance;

        private static object _lock = new object();

        public void PlayBackgroundMusic()
        {
            backgroundMusicplayer.URL= backgroundURL;
            backgroundMusicplayer.controls.play();
        }

        public void PlayEatingMusic()
        {
            coinMusicplayer.URL = coinURL;
            coinMusicplayer.controls.play();
        }

        public void PlayGameovermusic()
        {
            gameoverMusicplayer.URL = GameoverURL;
            gameoverMusicplayer.controls.play();
        }
    }
}
