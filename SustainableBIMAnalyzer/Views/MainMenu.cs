using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SustainableBIMAnalyzerWinForms
{
    public partial class MainMenu : Form
    {

        public MainMenu()
        {
            InitializeComponent();
            imageList1 = new ImageList();

            // The default image size is 16 x 16, which sets up a larger
            // image size. 
            imageList1.ImageSize = new Size(255, 255);
            imageList1.TransparentColor = Color.White;

            //tableLayoutPanel1.Dock = DockStyle.Fill;
        }

        private void flowLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void tableLayoutPanel2_Paint(object sender, PaintEventArgs e)
        {

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {
            //Control row1 = this.tableLayoutPanel1.GetControlFromPosition(0, 0);
            //Control row3 = this.tableLayoutPanel1.GetControlFromPosition(0, 2);

            //this.tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Absolute, Height = 50));
        }

        private void flowLayoutPanel1_Paint_1(object sender, PaintEventArgs e)
        {
            //Control row1 = this.tableLayoutPanel1.GetControlFromPosition(0, 0);

            //if (row1.Height > 50)
            //{
            //    row1.Size = new Size(102, row1.Width);
            //}

            //else if (row1.Height < 50)
            //{
            //    row1.Height = 50;
            //}
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {

        }

        private void treeView1_AfterSelect(object sender, TreeViewEventArgs e)
        {

        }

        private void trackBar1_Scroll(object sender, EventArgs e)
        {
            numericUpDown1.Value = trackBar1.Value;
        }

        private void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {
            //if (textBox1.Text.Equals(""))
            //{
            //    textBox1.Text = "0";
            //}

            trackBar1.Value = (int)numericUpDown1.Value;
        }

        private void treeView1_AfterSelect_1(object sender, TreeViewEventArgs e)
        {

        }
    }
}
