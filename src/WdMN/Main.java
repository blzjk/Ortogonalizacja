/* Błażej Kozikowski nr albumu 9705
Program, wykonujący ortogonalizację podanych 3 wektorów korzystając z algorytmu Grama-Schmidta
 Program napisany w języku JAVA*/

package WdMN;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program przeprowadzający ortogonalizację 3 wektorów korzystając z algorytmu Grama-Schmidta");
        System.out.println("Wektory: \na1 = (1,1,1)\na2 = (1,0,0)\na3 = (1,1,0)");

        int [] a1 = {1,1,1}; // wektor U1
        int [] a2 = {1,0,0}; // wektor U2
        int [] a3 = {1,1,0}; // wektor U3
        // V1=a1
        int [] V1 = a1;
        int normaV1dokwadratu = (int) (Math.pow(V1[0],2) + Math.pow(V1[1],2) + Math.pow(V1[2],2));
        // Obliczenie wektora V2
        int U2razyV1 = a2[0]*V1[0] + a2[1]*V1[1] + a2[2]*V1[2];
        int V2pierwszyElementTablicy = a2[0]- (U2razyV1/normaV1dokwadratu)*V1[0];
        int V2drugiElementTablicy = a2[1]- (U2razyV1/normaV1dokwadratu)*V1[1];
        int V2trzeciElementTablicy = a2[2]- (U2razyV1/normaV1dokwadratu)*V1[2];
        int [] V2 = {V2pierwszyElementTablicy, V2drugiElementTablicy, V2trzeciElementTablicy};

        //Obliczenie wektora V3
        double U3razyV1 = a3[0]*V1[0] + a3[1]*V1[1] + a3[2]*V1[2];
        double U3razyV2 = a3[0]*V2[0] + a3[1]*V2[1] + a3[2]*V2[2];
        double normaV2dokwadratu = (int) (Math.pow(V2[0],2) + Math.pow(V2[1],2) + Math.pow(V2[2],2));
        double [] U3razyV1przezNormaRazyV1 = {(U3razyV1/normaV1dokwadratu)*V1[0], (U3razyV1/normaV1dokwadratu)*V1[1], (U3razyV1/normaV1dokwadratu)*V1[2]};
        double [] U3razyV2przezNormaRazyV2 = {(U3razyV2/normaV2dokwadratu)*V2[0], (U3razyV2/normaV2dokwadratu)*V2[1], (U3razyV2/normaV2dokwadratu)*V2[2]};
        double [] sumaWyrazen = {
                U3razyV1przezNormaRazyV1[0] + U3razyV2przezNormaRazyV2[0],
                U3razyV1przezNormaRazyV1[1] + U3razyV2przezNormaRazyV2[1],
                U3razyV1przezNormaRazyV1[2] + U3razyV2przezNormaRazyV2[2]};
        int [] V3 = {(int) (a3[0]-sumaWyrazen[0]), (int) (a3[1]-sumaWyrazen[1]), (int) (a3[2]-sumaWyrazen[2])};
        System.out.println(
                        "\nPo procesie ortogonalizacji otrzymujemy następujące wektory: \nV1 = (" + V1[0] + ", " + V1[1] + ", " + V1[2] + ")" +
                         "\nV2 = (" + V2[0] + ", " + V2[1] + ", " + V2[2] + ")" +
                        "\nV3 = (" + V3[0] + ", " + V3[1] + ", " + V3[2] + ")" );








    }
}
