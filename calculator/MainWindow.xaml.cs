using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace calculator
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public string num1;
        public string num2;
        public string op;
        public MainWindow()
        {
            InitializeComponent();
        }

        private void TextBox_TextChanged(object sender, TextChangedEventArgs e)
        {

        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            
        }

        private void Button_Click_1(object sender, RoutedEventArgs e)
        {

        }

        private void Button_Click_2(object sender, RoutedEventArgs e)
        {

        }

        private void Button_Click_3(object sender, RoutedEventArgs e)
        {

        }

        private void Button_Click_Number(object sender, RoutedEventArgs e)
        {
            Button numberButton = (Button)sender;
            string number = (string)numberButton.Content;

            //MessageBox.Show(number);

            ResultText.Text = ResultText.Text + number;
        }

        private void Button_Click_Operator(object sender, RoutedEventArgs e)
        {
            Button operatorButton = (Button)sender;
            string operatorString = (string)operatorButton.Content;

            if(operatorString == "+")
            {
                num1 = ResultText.Text;
                ResultText.Text = "";
                op  = "+";
            }
            else if (operatorString == "-")
            {
                num1 = ResultText.Text;
                ResultText.Text = "";
                op = "-";
            }
            else if (operatorString == "*")
            {
                num1 = ResultText.Text;
                ResultText.Text = "";
                op = "*";
            }
            else if (operatorString == "/")
            {
                num1 = ResultText.Text;
                ResultText.Text = "";
                op = "/";
            }
            else if (operatorString == "=")
            {
                num2 = ResultText.Text;

                double numDouble1 = double.Parse(num1);
                double numDouble2 = double.Parse(num2);

                double ResultValue = 0.0;
                bool isComplite = true;
                if(op == "+")
                {
                    ResultValue = numDouble1 + numDouble2;
                }else if(op == "-")
                {
                    ResultValue = numDouble1 - numDouble2;
                }else if(op == "*")
                {
                    ResultValue = numDouble1 * numDouble2;
                }else if(op == "/")
                {
                    ResultValue = numDouble1 / numDouble2;

                }
                else
                {
                    isComplite = false;
                }

                if(isComplite)
                {
                    ResultText.Text = "" + ResultValue;
                }

            }
        }
    }
}
