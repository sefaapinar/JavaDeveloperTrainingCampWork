using System;

namespace OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] dizi1 = new[] { 1, 2, 3 };
            int[] dizi2 = new[] { 10, 20, 30 };

            dizi1 = dizi2;

            dizi2[0] = 1000;
            Console.WriteLine(dizi1[0]);
        }
    }
}
