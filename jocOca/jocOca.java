package jocOca;

import java.util.Random;
import java.util.Scanner;

public class jocOca {

    public static void main(String[] args) {
        jocOca p = new jocOca();
        p.main2();
    }

    public void main2() {
        int tablero [] = new int[63];
        int turno;
        boolean AlguGuanyat = false;
        Scanner Scanner1 = new Scanner(System.in);

        System.out.println("Quants jugadors volen jugar? \n (1 - 2 - 3 - 4)");
        int jugadors = Scanner1.nextInt();

        int[] posiciones = new int[jugadors + 1];


            // Oca (5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54 i 59) En caure a l'oca, s’avança fins a la següent casella on hi ha dibuixada una oca i es torna a tirar. “De oca en oca y tiro porque me toca.”
            //Pont (6 i 12) Si es cau a una casella de pont, es va fins a l’altra casella de pont i es torna a tirar. “De puente a puente y tiro porque me lleva la corriente.”
            //Fonda (19) Una jugada sense moure’s.
            //Daus 3-6 (26) Si traiem un 3-6 a la primera tirada, avancem fins aquí. “De dado a dado y tiro porque me ha tocado.”
            //Pou (31) Dues jugades sense moure’s. Si un altre jugador hi cau, se surt al següent torn.
            //Laberint (42) Es torna a la casella 39.
            //Presó (52) El jugador no es pot moure fins que passin tres torns.

        //  JOC PRINCIPAL OCA
        do {
            for (int i = 1; i <= jugadors; i++) {
            System.out.println("---TORN JUGADOR " + i + " ---");
            System.out.println("Pressiona el botó 'Enter'!");
            Scanner1.nextLine();

            // tirada de dau
            int dau = dado();
            posiciones[i] = posiciones[i] + dau;

            // Si pasem mes de 63 ens resti
            if (posiciones[i] > 63) {
            int exceso = posiciones[i] - 63;
            posiciones[i] = 63 - exceso;
            System.out.println("T'has passat! Retrocedeixes a la casella " + posiciones[i]);
        }

            // comprovem
            int posAbans = posiciones[i];
            posiciones[i] = comprobarCasilla(posiciones[i], i);

            // Si la posició es Oca o Pont, torna a tirar
            // (Excepte al Laberint, on no es torna a tirar)
            if (posiciones[i] != posAbans && posAbans != 42) {
                System.out.println("TIRA DE NOU, JUGADOR " + i + "!");
                i--;
            }

            if (posiciones[i] == 63) {
                System.out.println("FELICITATS, EL JUGADOR " + i + " HA GUANYAT!");
                AlguGuanyat = true;
                break;
            }

            System.out.println("El jugador " + i + " esta en la casella " + posiciones[i]);
            
            
        }
        } while (!(AlguGuanyat == true));

        

    }

    public int comprobarCasilla(int posicionActual, int turno) {
        if (posicionActual == 5 || posicionActual == 9 || posicionActual == 14 || posicionActual == 18 || posicionActual == 23 || posicionActual == 27 || posicionActual == 32 || posicionActual == 36 || posicionActual == 41 || posicionActual == 45 || posicionActual == 50 || posicionActual == 54 || posicionActual == 59) {

            // avançar de casella
                if (posicionActual == 5) {
                    posicionActual = 9;
                    System.out.println("T'has mogut fins la posició " + posicionActual);
                    } 
                    else if (posicionActual == 9) {
                        posicionActual = 14;
                        System.out.println("T'has mogut fins la posició " + posicionActual);
                        }
                        else if (posicionActual == 14) {
                            posicionActual = 18;
                            System.out.println("T'has mogut fins la posició " + posicionActual);
                            }
                            else if (posicionActual == 18) {
                                posicionActual = 23;
                                System.out.println("T'has mogut fins la posició " + posicionActual);
                                }
                                else if (posicionActual == 23) {
                                    posicionActual = 27;
                                    System.out.println("T'has mogut fins la posició " + posicionActual);
                                    }
                                    else if (posicionActual == 27) {
                                        posicionActual = 32;
                                        System.out.println("T'has mogut fins la posició " + posicionActual);
                                        }
                                        else if (posicionActual == 32) {
                                            posicionActual = 36;
                                            System.out.println("T'has mogut fins la posició " + posicionActual);
                                            }
                                            else if (posicionActual == 36) {
                                                posicionActual = 41;
                                                System.out.println("T'has mogut fins la posició " + posicionActual);
                                                }
                                                else if (posicionActual == 41) {
                                                    posicionActual = 45;
                                                    System.out.println("T'has mogut fins la posició " + posicionActual);
                                                    }
                                                    else if (posicionActual == 45) {
                                                        posicionActual = 50;
                                                        System.out.println("T'has mogut fins la posició " + posicionActual);
                                                        }
                                                        else if (posicionActual == 50) {
                                                            posicionActual = 54;
                                                            System.out.println("T'has mogut fins la posició " + posicionActual);
                                                            }
                                                            else if (posicionActual == 54) {
                                                                posicionActual = 59;
                                                                System.out.println("T'has mogut fins la posició " + posicionActual);
                                                                }
                                                                else if (posicionActual == 59) {
                                                                    posicionActual = 54;
                                                                    System.out.println("T'has mogut fins la posició " + posicionActual);
                                                                    }


            System.out.println("“De oca en oca y tiro porque me toca.");
            turno--;
        }
            if (posicionActual == 6 || posicionActual == 12) {
                
                // avançar de casella
                if (posicionActual == 6) {
                    posicionActual = 12;
                    System.out.println("T'has mogut fins la posició " + posicionActual);
                    }
                    else if (posicionActual == 12) {
                        posicionActual = 6;
                        System.out.println("T'has mogut fins la posició " + posicionActual);
                        }

                System.out.println("De puente a puente y tiro porque me lleva la corriente.");
                turno--;
            }

            if (posicionActual == 19) {
                System.out.println("Has caigut en la Fonda!");
                turno++;
            }
            
            if (dado() == 3 || dado() == 6 && posicionActual == 0) {
                posicionActual = 26;

                System.out.println("T'has mogut fins a la posició " + posicionActual);
                System.out.println("De dado a dado tiro porque me ha tocado!");
            }

            //  POU, 2 JUGADAS SIN MOVER, HACERLO LUEGO
            if (posicionActual == 31) {
                
            }

            //  LABERINT
            if (posicionActual == 42) {
                posicionActual = 39;

                System.out.println("Has caigut al Laberint! \n Has tornat a la casella " + posicionActual);
            }

            //  PRESÓ, 3 TORNS SENSE MOURE S
            if (posicionActual == 52) {
                
            }


    return posicionActual;
    }
    
    public int dado() {
        Random r = new Random();
        int dau = r.nextInt(6)+1;
        System.out.println(dau);
        return dau;
    }
}

