using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace informacionweb
{
    public partial class CalculadoraGUI : Form
    {
        public CalculadoraGUI()
        {
            InitializeComponent();
        }
        double numero1, numero2, resultado;
        string operacion;
        bool secuencia = true;
        private void C1_Click(object sender, EventArgs e)
        {

        }

        private void C2_Click(object sender, EventArgs e)
        {

        }

        private void C3_Click(object sender, EventArgs e)
        {

        }

        private void C4_Click(object sender, EventArgs e)
        {

        }
        // Numero de la calculadora
        private void C5_Click(object sender, EventArgs e)
        {
           if(secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "1";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "1";
            }        
        }
        // Numero de la calculadora
        private void C6_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "2";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "2";
            }
        }
        // Numero de la calculadora
        private void C7_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "3";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "3";
            }
        }

        private void C8_Click(object sender, EventArgs e)
        {
            operacion = "+";
            numero1 = double.Parse(Pantalla.Text);
            secuencia = true;
        }
        // Numero de la calculadora
        private void C9_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "4";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "4";
            }
        }
        // Numero de la calculadora
        private void C10_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "5";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "5";
            }
        }
        // Numero de la calculadora
        private void C11_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "6";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "6";
            }
        }

        private void C12_Click(object sender, EventArgs e)
        {
            operacion = "-";
            numero1 = double.Parse(Pantalla.Text);
            secuencia = true;
        }
        // Numero de la calculadora
        private void C13_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "7";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "7";
            }
        }
        // Numero de la calculadora
        private void C14_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "8";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "8";
            }
        }
        // Numero de la calculadora
        private void C15_Click(object sender, EventArgs e)
        {
            if (secuencia == true)
            {
                Pantalla.Text = "";
                Pantalla.Text = "9";
                secuencia = false;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "9";
            }
        }

        private void C16_Click(object sender, EventArgs e)
        {
            operacion = "/";
            numero1 = double.Parse(Pantalla.Text);
            secuencia = true;
        }

        private void C17_Click(object sender, EventArgs e)
        {
            operacion = "*";
            numero1 = double.Parse(Pantalla.Text);
            secuencia = true;
        }
        // Numero de la calculadora
        private void C18_Click(object sender, EventArgs e)
        {
            if (Pantalla.Text == "0")
            {
                return;
            }
            else
            {
                Pantalla.Text = Pantalla.Text + "0";
            }
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void C19_Click(object sender, EventArgs e)
        {
            operacion = "^";
            numero1 = double.Parse(Pantalla.Text);
            secuencia = true;
        }

        private void C20_Click(object sender, EventArgs e)
        {
            numero2 = double.Parse(Pantalla.Text);
            if (operacion == "+")
            {
                resultado = numero1 + numero2;
                Pantalla.Text = resultado.ToString();
                secuencia = true;
            }
            if (operacion == "-")
            {
                resultado = numero1 - numero2;
                Pantalla.Text = resultado.ToString();
                secuencia = true;
            }
            if (operacion == "*")
            {
                resultado = numero1 * numero2;
                Pantalla.Text = resultado.ToString();
                secuencia = true;
            }
            if (operacion == "/")
            {
                resultado = numero1 / numero2;
                Pantalla.Text = resultado.ToString();
                secuencia = true;
            }
            if (operacion == "^")
            {
                resultado = Math.Pow(numero1, numero2);
                Pantalla.Text = resultado.ToString();
                secuencia = true;
            }
        }
    }
}
