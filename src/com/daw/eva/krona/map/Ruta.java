package com.daw.eva.krona.map;

import Varies.Cadena;
import Varies.Data;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;



public class Ruta {
	/*
	Queue = colas del tipo FIFO (first in, first out), cola por la que se insertan elementos por un extremo y van
	saliendo por el otro (como en la cola de la compra).
	
	Deque = double ended queue (cola doblemente terminada, enlazada, que permite insertar y eliminar
	elementos por ambos extremos a diferencia de una cola tipo FIFO). Es un tipo de Queue.
	 */
	
	/*
	private static ComprovacioRendiment serialitzarRuta(ComprovacioRendiment comprovacioRendimentTmp) {
		ObjectOutputStream fileOut = null;
		File f = new File("fitxerAmbDadesSerialitzades.bin");
		
		
		try {
			fileOut = new ObjectOutputStream(new FileOutputStream(f));
			
			fileOut.writeObject(new Waypoint_Dades(0, "Òrbita de la Terra", new int[] {0,0,0}, true, LocalDateTime.parse("21-10-2020 01:10", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
			fileOut.writeObject(new Waypoint_Dades(1, "Punt Lagrange Terra-LLuna", new int[] {1,1,1}, true, LocalDateTime.parse("21-10-2020 01:00", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
			fileOut.writeObject(new Waypoint_Dades(2, "Òrbita de la LLuna", new int[] {2,2,2}, true, LocalDateTime.parse("21-10-2020 00:50", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
			fileOut.writeObject(new Waypoint_Dades(3, "Òrbita de Mart", new int[] {3,3,3}, true, LocalDateTime.parse("21-10-2020 00:40", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
			fileOut.writeObject(new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
			fileOut.writeObject(new Waypoint_Dades(5, "Punt Lagrange Júpiter-Europa", new int[] {5,5,5}, true, LocalDateTime.parse("21-10-2020 00:20", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
			fileOut.writeObject(new Waypoint_Dades(6, "Òrbita de Europa", new int[] {6,6,6}, true, LocalDateTime.parse("21-10-2020 00:10", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
			fileOut.writeObject(new Waypoint_Dades(7, "Òrbita de Venus", new int[] {7,7,7}, true, LocalDateTime.parse("21-10-2020 00:01", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));

		} catch (IOException e) {
			System.out.println("Ruta - serialitzarRuta() - IOException 1");
			e.printStackTrace();
		} finally {
			try {
				fileOut.close();
			} catch (IOException e) {
				System.out.println("Ruta - serialitzarRuta() - IOException 2");
				e.printStackTrace();
			}
			
			return comprovacioRendimentTmp; 
        }
	}
	
	
	
	private static List<Waypoint_Dades> deserialitzarRuta() {
		List<Waypoint_Dades> llistaWaypointLinkedList;
		ObjectInputStream fileIn = null;
		File f = new File("fitxerAmbDadesSerialitzades.bin");
		
		
		llistaWaypointLinkedList = new LinkedList<Waypoint_Dades>();
		
		try {
			fileIn = new ObjectInputStream(new FileInputStream(f));
			
            while (true) {
            	Waypoint_Dades aux = (Waypoint_Dades) fileIn.readObject();
            	llistaWaypointLinkedList.add(aux);
            }
        } catch (EOFException e) {
            System.out.println("Ruta - deserialitzarRuta() - EOFException (és la forma de sapiguer que s'ha acabat de procesar CORRECTAMENT el fitxer.)");
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
        	try {
				fileIn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	
        	return llistaWaypointLinkedList;
        }
	}
	*/
	
	
	private static List<Waypoint_Dades> crearRutaInicial() {
		List<Waypoint_Dades> llistaWaypointLinkedList = null;
		
		
		llistaWaypointLinkedList = new LinkedList<Waypoint_Dades>();
		
		llistaWaypointLinkedList.add(new Waypoint_Dades(0, "Òrbita de la Terra", new int[] {0,0,0}, true, LocalDateTime.parse("21-10-2020 01:10", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(1, "Punt Lagrange Terra-LLuna", new int[] {1,1,1}, true, LocalDateTime.parse("21-10-2020 01:00", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(2, "Òrbita de la LLuna", new int[] {2,2,2}, true, LocalDateTime.parse("21-10-2020 00:50", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(3, "Òrbita de Mart", new int[] {3,3,3}, true, LocalDateTime.parse("21-10-2020 00:40", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(5, "Punt Lagrange Júpiter-Europa", new int[] {5,5,5}, true, LocalDateTime.parse("21-10-2020 00:20", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(6, "Òrbita de Europa", new int[] {6,6,6}, true, LocalDateTime.parse("21-10-2020 00:10", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(7, "Òrbita de Venus", new int[] {7,7,7}, true, LocalDateTime.parse("21-10-2020 00:01", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		
		return llistaWaypointLinkedList;
	}
	
	
	
	
	//10. Inicialitzar una ruta.
	// Hem de recordar d'executar el menú 1 que és el que crida al constructor de ComprovacioRendiment perquè així es creii "pilaWaypoints"
	// quan s'executa "this.pilaWaypoints = new ArrayDeque<Waypoint_Dades>();" en el constructor de la classe ComprovacioRendiment.
	public static ComprovacioRendiment inicialitzarRuta(ComprovacioRendiment comprovacioRendimentTmp) {
		List<Waypoint_Dades> llistaWaypointLinkedList;
		Waypoint_Dades wtmp;
		
		
		//comprovacioRendimentTmp = serialitzarRuta(comprovacioRendimentTmp);
		//llistaWaypointLinkedList = deserialitzarRuta();
		llistaWaypointLinkedList = crearRutaInicial();
		
		for (Waypoint_Dades waypointTmp : llistaWaypointLinkedList) {
			comprovacioRendimentTmp.pilaWaypoints.push(waypointTmp);
		}
		
		wtmp = new Waypoint_Dades(4, "Òrbita de Júpiter REPETIDA", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter));
		comprovacioRendimentTmp.pilaWaypoints.addFirst(wtmp);		// Estem copian una referència de wtmp i no pas l'objecte en si.
		comprovacioRendimentTmp.wtmp = wtmp;						// Estem copian una referència de wtmp i no pas l'objecte en si.
																	// En tots 2 llocs estem copian la mateixa referència.
		
		
		return comprovacioRendimentTmp;
	}
	
	
	//11. Visualitzar una ruta.
	public static void visualitzarRuta(ComprovacioRendiment comprovacioRendimentTmp) {
		System.out.println("La ruta està formada pels waypoints:");
		
		for (Waypoint_Dades waypointTmp : comprovacioRendimentTmp.pilaWaypoints) {
			System.out.println(waypointTmp.toString());
		}
	}
	
	
	//12. Invertir una ruta i visualitzar-la amb toString().
	public static void invertirRuta(ComprovacioRendiment comprovacioRendimentTmp) {		
		//Cuando usamos una Deque como pila (stack). Només es poden fer servir els mètodes d'una pila (push, pop,...).
		Deque<Waypoint_Dades> pilaWaypointsInversa = new ArrayDeque<Waypoint_Dades>();
		
        while (!comprovacioRendimentTmp.pilaWaypoints.isEmpty()) {
        	pilaWaypointsInversa.push(comprovacioRendimentTmp.pilaWaypoints.pop());
        	
        	// Hem buidat comprovacioRendimentTmp.pilaWaypoints per culpa dels pop() que li hem fet.
        }
        
        while (!pilaWaypointsInversa.isEmpty()) {
        	System.out.println(pilaWaypointsInversa.pop());
        }
        
        //System.out.println("pilaWaypointsInversa.toString(): \n" + pilaWaypointsInversa.toString());
	}
	
	
	//13. Existeix el waypoint 'Òrbita de Júpiter REPETIDA' en la ruta?
	// Hem de tornar a generar la ruta, menú 10 si hem executat el menú 12.
	public static void existeixWaypointEnRuta(ComprovacioRendiment comprovacioRendimentTmp) {
		//Iterator it = comprovacioRendimentTmp.pilaWaypoints.descendingIterator();
		Waypoint_Dades wtmp;
		
		if (comprovacioRendimentTmp.pilaWaypoints.size() == 0) {
			System.out.println("La ruta està buida.");
		} else {
			if (comprovacioRendimentTmp.pilaWaypoints.contains(comprovacioRendimentTmp.wtmp)) {
				System.out.println("SI hem trobat el waypoint " + comprovacioRendimentTmp.wtmp.getNom() + " emmagatzemat en comprovacioRendimentTmp.wtmp, en la llista.");
			} else {
				System.out.println("NO hem trobat el waypoint " + comprovacioRendimentTmp.wtmp.getNom() + " emmagatzemat en comprovacioRendimentTmp.wtmp, en la llista.");
			}
			
			wtmp = new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter));
			if (comprovacioRendimentTmp.pilaWaypoints.contains(wtmp)) {
				System.out.println("SI hem trobat el waypoint " + wtmp.getNom() + " creat ara mateix, en la llista.");
			} else {
				System.out.println("NO hem trobat el waypoint " + wtmp.getNom() + " creat ara mateix, en la llista.");
			}
		}
	}
	
	
	/*
	//14. Inicialitzar una ruta amb contingut NO verificat.
	public static Deque inicialitzarRutaNoVerificada(ComprovacioRendiment comprovacioRendimentTmp) {
		Deque pilaWaypoints = new ArrayDeque();
		
		for (Waypoint_Dades waypointTmp : comprovacioRendimentTmp.llistaArrayList) {
			pilaWaypoints.push(waypointTmp);
		}
		
		pilaWaypoints.addFirst("element afegit a la 1a posició");
		pilaWaypoints.addLast("element afegit a la última posició");
		
		return pilaWaypoints;
	}
	
	
	//15. Visualitzar una ruta amb contingut NO verificat.
	// Si no volem ficar el <T> entre static i void a llavors hem de fer servir el ? en comptes del <T> en el paràmetre d'entrada.
	public static void visualitzarRutaNoVerificada(Deque<?> pilaWaypoints) {		
		System.out.println("La ruta està formada pels waypoints:");
		
		for (Object waypointTmp : pilaWaypoints) {
			System.out.println(waypointTmp.toString());
		}
	}
	
	
	//16. Invertir una ruta amb contingut NO verificat.
	// Si no porta el <T> entre static i void no va.
	public static <T> void invertirRutaNoVerificada(Deque<T> pilaWaypoints) {		
		Deque<T> pilaWaypointsInversa = new ArrayDeque<T>();
		
        while (!pilaWaypoints.isEmpty()) {
        	pilaWaypointsInversa.push(pilaWaypoints.pop());
        }
	}
	*/
	
	
	//20. Inicialitzar llista de rutes.
	public static ComprovacioRendiment inicialitzaLListaRutes(ComprovacioRendiment comprovacioRendimentTmp) {
		Ruta_Dades ruta_0;
		Ruta_Dades ruta_1;
		Ruta_Dades ruta_2;
		Ruta_Dades ruta_3;
		Ruta_Dades ruta_4;
		
		
		ruta_0 = new Ruta_Dades(0, "ruta 0: Terra --> Punt Lagrange Júpiter-Europa", new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5)), true, LocalDateTime.parse("28-10-2020 16:30", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:30", Data.formatter));
		ruta_1 = new Ruta_Dades(1, "ruta 1: Terra --> Òrbita de Mart (directe)", new ArrayList<Integer>(Arrays.asList(0, 3)), true, LocalDateTime.parse("28-10-2020 16:31", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:31", Data.formatter));
		ruta_2 = new Ruta_Dades(2, "ruta 2.1: Terra --> Òrbita de Venus", new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7)), true, LocalDateTime.parse("28-10-2020 16:32", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:32", Data.formatter));
		ruta_3 = new Ruta_Dades(3, "ruta 3: Terra --> Mart (directe) --> Òrbita de Júpiter ", new ArrayList<Integer>(Arrays.asList(0, 3, 4)), true, LocalDateTime.parse("28-10-2020 16:33", Data.formatter), null, LocalDateTime.parse("28-10-2020 16:33", Data.formatter));
		ruta_4 = new Ruta_Dades(4, "ruta 2.2: Terra --> Òrbita de Venus (REPETIDA)", new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7)), true, LocalDateTime.parse("28-10-2020 16:32", Data.formatter), null, LocalDateTime.parse("30-10-2020 19:49", Data.formatter));
		
		comprovacioRendimentTmp.llistaRutes.add(ruta_0);
		comprovacioRendimentTmp.llistaRutes.add(ruta_1);
		comprovacioRendimentTmp.llistaRutes.add(ruta_2);
		comprovacioRendimentTmp.llistaRutes.add(ruta_3);
		comprovacioRendimentTmp.llistaRutes.add(ruta_4);
		
		System.out.println("Insertades les rutes:");
		for(Ruta_Dades rutaTmp : comprovacioRendimentTmp.llistaRutes) {
			System.out.println(rutaTmp.getNom() + ": waypoints" + rutaTmp.getWaypoints());
		}
		
		return comprovacioRendimentTmp;
	}
	
	
	
	// Crea 2 sets, A i B, de números i fes:
	// A ⊂ B (subconjunt): A és un subconjunt de B si tots els elements d'A estan dins de B.
	
		
	//21. Ficar tots els waypoints en un set.
	// A ∪ B (unió): conjunt que conté tots els elements d'A i B.
	public static void setUnio(ComprovacioRendiment comprovacioRendimentTmp) {
		Set<Integer> unio = new HashSet<Integer>();
		
		
		for(Ruta_Dades rutaTmp : comprovacioRendimentTmp.llistaRutes) {
			unio.addAll(rutaTmp.getWaypoints()); //No es repeteixen
		}
		
		System.out.println("ID dels waypoints ficats en el set: " + unio);
	}
	
	
	
	//22. Waypoints que estan en totes les rutes.
	// A ∩ B (intersecció): conjunt amb tots els elements que estan en A i B a la vegada.
	public static void setInterseccio(ComprovacioRendiment comprovacioRendimentTmp) {
		Set<Integer> interseccio = new HashSet<Integer>();

		
		for(Ruta_Dades rutaTmp : comprovacioRendimentTmp.llistaRutes) {
			interseccio.addAll(rutaTmp.getWaypoints());
		}
		
		for(Ruta_Dades rutaTmp : comprovacioRendimentTmp.llistaRutes) {
			interseccio.retainAll(rutaTmp.getWaypoints());
			// retain = quedar-se amb, conservar.
			// retainAll(Collection<?> c)
			// Retains only the elements in this set that are contained in the specified collection (optional operation).
		}
		
		System.out.println("ID dels waypoints en totes les rutes: " + interseccio);
	}
	
	
	
	// Retorna la posició de la ruta dins de la llista comprovacioRendimentTmp.llistaRutes .
	// Si no estigués, a llavors retornaria -1.
	private static int buscarRuta(int numRuta, ComprovacioRendiment comprovacioRendimentTmp) {
		int posRuta;
		
		
		posRuta = -1;
		for (int i = 0; i < comprovacioRendimentTmp.llistaRutes.size(); i++) {
			if (comprovacioRendimentTmp.llistaRutes.get(i).getId() == numRuta) {
				posRuta = i;
				break;
			}
		}
		
		return posRuta;
	}
		
	
	//23. Waypoints que estan en la ruta A i no en la ruta B.
	// A - B (resta): conjunt amb els elements d'A que no estan en B.
	public static void setResta(ComprovacioRendiment comprovacioRendimentTmp) {
		Set<Integer> resta = new HashSet<Integer>();
		int numParamLLegits;
		boolean existeixenErrors;
		String rutesAComparar = null;
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		String rutaTmp = "";
		int rutaA = 0;
		int rutaB = 0;
		int posRutaA;
		int posRutaB;
		
		
		System.out.println("Rutes actuals:");
		for(Ruta_Dades rutaTmp2 : comprovacioRendimentTmp.llistaRutes) {
			System.out.println("ID " + rutaTmp2.getId() + ": " + rutaTmp2.getNom() + ": waypoints" + rutaTmp2.getWaypoints());
		}
		System.out.println();
		
		numParamLLegits = 0;
		existeixenErrors = true;
		do {
			existeixenErrors = false;
			
			System.out.print("Selecciona ruta A i B (format: 3 17): ");
			rutesAComparar = sc.nextLine();
			
			numParamLLegits = rutesAComparar.split(" ").length;
			if (numParamLLegits != 2) {
				System.out.println("ERROR: introduir 2 paràmetres separats per 1 espai en blanc. Has introduit " + numParamLLegits + " paràmetres.");
				existeixenErrors = true;
			}
			
			if (!existeixenErrors) {
				st = new StringTokenizer(rutesAComparar, " ");
				rutaTmp = st.nextToken();
				if (Cadena.stringIsInt(rutaTmp)) {
					rutaA = Integer.parseInt(rutaTmp);
				} else {
					System.out.println("ERROR: has introduit " + rutaTmp + " com a ruta. Els ID de les rutes són integers.");
					existeixenErrors = true;
				}
				
				if (!existeixenErrors) {
					rutaTmp = st.nextToken();
				 	if (Cadena.stringIsInt(rutaTmp)) {
						rutaB = Integer.parseInt(rutaTmp);
					} else {
						System.out.println("ERROR: has introduit " + rutaTmp + " com a ruta. Els ID de les rutes són integers.");
						existeixenErrors = true;
					}
					
					if (!existeixenErrors) {
						posRutaA = buscarRuta(rutaA, comprovacioRendimentTmp);
						if (posRutaA != -1) {
							posRutaB = buscarRuta(rutaB, comprovacioRendimentTmp);
							if (posRutaB != -1) {
								// Ara ja hem comprobat que les 2 rutes que ens han ficat existeixen.
								// Ara buscarem els waypoints que estan en la ruta A i no en la B.
								System.out.println();
								
								resta.addAll(comprovacioRendimentTmp.llistaRutes.get(posRutaA).getWaypoints());
								System.out.println("HashSet (havent-hi afegir els waypoints de la ruta A) = " + resta);
								
								resta.removeAll(comprovacioRendimentTmp.llistaRutes.get(posRutaB).getWaypoints());
								System.out.println("HashSet (havent-hi tret els waypoints de la ruta B) = " + resta);
							} else {
								System.out.println("ERROR: no existeix la ruta " + rutaB + " en el sistema.");
								existeixenErrors = true;
							}
						} else {
							System.out.println("ERROR: no existeix la ruta " + rutaA + " en el sistema.");
							existeixenErrors = true;
						}
					}
				}
			}
		} while (existeixenErrors); 
	}
	
	
	
	//24. Ordenar les rutes per waypoints i ID.
	public static void crearSetOrdenatDeRutes(ComprovacioRendiment comprovacioRendimentTmp) {
		SortedSet<Ruta_Dades> setOrdenatRutes = new TreeSet<Ruta_Dades>();
		
		
		setOrdenatRutes.addAll(comprovacioRendimentTmp.llistaRutes);
		// Les Ruta_Dades que tinguin els mateixos waypoints fa que siguin iguals (està definit en el compareTo() de Ruta_Dades) i per tant
		// només hi pot haver 1 en el TreeSet (la 1a que fiquem).
		
		for(Ruta_Dades rutaTmp : setOrdenatRutes) {
			System.out.println("ID " + rutaTmp.getId() + ": " + rutaTmp.getNom() + ": waypoints" + rutaTmp.getWaypoints());
		}
	}
	
	
	
	// Volem crear un map on ficarem totes les rutes creades en el menú 20. S'ha d'executar el menú 20 abans.
	// Poden existir rutes amb les mateixes dades (menys el ID, es clar).
	// Crea el mapa que mantingui l'ordre temporal en que es van inserir les rutes.
	// Visualitza de 3 formes diferents el contingut del mapa (veure un dels exemples que hi ha penjat en el moodle).
	// Copia tot el contingut del mapa en comprovacioRendimentTmp.mapaLinkedDeRutes . Alerta: s'ha de crear l'objecte en el constructor.
	//30. Crear un MAP de rutes i visualitzar-lo.
	public static void crearLinkedHashMapDeRutes (ComprovacioRendiment comprovacioRendimentTmp) {
		long tempsInicial;
		long tempsFinal;
		int temps1aForma;
		int temps2aForma;
		int temps3aForma;
		LinkedHashMap<Integer, Ruta_Dades> mapaLinkedDeRutes;
		int clauDelMap;
		
		
		mapaLinkedDeRutes = new LinkedHashMap<Integer, Ruta_Dades>();
		for(Ruta_Dades rutaTmp : comprovacioRendimentTmp.llistaRutes) {
			mapaLinkedDeRutes.put(rutaTmp.getId(), rutaTmp);
		}
		
		// 1a forma de visualitzar el contingut del map.
		// Fem un set amb les entrades del map i el recorrem. Es crea un set on el seu contingut són les entrades del mapa.
		tempsInicial = System.nanoTime();
		Set setTmp = mapaLinkedDeRutes.entrySet();
		Iterator it1 = setTmp.iterator();
		System.out.println("1a forma de visualitzar el contingut del map (map --> set + iterador del set):");
        while(it1.hasNext()) {
           Map.Entry me = (Map.Entry)it1.next();
           System.out.println("Clau del map = " + me.getKey() + ": \n" + me.getValue().toString());
        }
        tempsFinal = System.nanoTime();
        temps1aForma = (int)((tempsFinal - tempsInicial)/1000);
        
        // 2a forma de visualitzar el contingut del map.
        // Fem un iterador que navegui per les claus del mapa. Es crea un set on el seu contingut són les claus del map.
		tempsInicial = System.nanoTime();
        System.out.println();
        System.out.println("2a forma de visualitzar el contingut del map (iterator de les claus del map):");
        Iterator<Integer> it2 = mapaLinkedDeRutes.keySet().iterator();
        while (it2.hasNext()) {
            clauDelMap = it2.next();
            System.out.println(clauDelMap + ": " + mapaLinkedDeRutes.get(clauDelMap));
        }
        tempsFinal = System.nanoTime();
        temps2aForma = (int)((tempsFinal - tempsInicial)/1000);
        
        // 3a forma de visualitzar el contingut del map.
        // Lo mateix que la forma 1 però fent servir un bucle for en comptes d'un iterator.
        tempsInicial = System.nanoTime();
        System.out.println();
        System.out.println("3a forma de visualitzar el contingut del map (for-each del map --> set):");
        for (Entry<Integer, Ruta_Dades> dada : mapaLinkedDeRutes.entrySet()) {
            System.out.println(dada.getKey() + ": " + dada.getValue().toString());
        }
        tempsFinal = System.nanoTime();
        temps3aForma = (int)((tempsFinal - tempsInicial)/1000);
		
        System.out.println();
        System.out.println("TEMPS PER 1a FORMA (map --> set + iterador del set): " + temps1aForma);
        System.out.println("TEMPS PER 2a FORMA (iterator de les claus del map): " + temps2aForma);
        System.out.println("TEMPS PER 3a FORMA (for-each del map --> set): " + temps3aForma);
		
        
        comprovacioRendimentTmp.mapaLinkedDeRutes.putAll(mapaLinkedDeRutes);
        // No fem un return de comprovacioRendimentTmp perquè en realitat quan el rebem per paràmetre, estem rebent un apuntador i no
        // el propi objecte.
        // EL PROBLEMA ÉS QUE A LLAVORS NO SABEM QUINS MÈTODES MODIFIQUEN EL CONTINGUT DE comprovacioRendimentTmp A MENYS QUE
        // MIREM EL SEU CODI.
	}
	
	
	
	// Visualitza totes les rutes que tinguin un waypoint concret.
	// Només t'has d'assegurar que l'usuari fica un nº.
	// S'ha d'executar el menú 30 abans.
	//31. Visualitza totes les rutes que tinguin un waypoint concret.
	public static void visualitzarRutesDelMapAmbUnWaypointConcret(ComprovacioRendiment comprovacioRendimentTmp) {
		boolean existeixenErrors;
		Scanner sc = new Scanner(System.in);
		String entradaPerTeclat = "";
		int waypointABuscar = -1;
		Ruta_Dades rutaTmp;
		
		
		existeixenErrors = true;
		do {
			existeixenErrors = false;
			
			System.out.print("Escriu el nº del waypoint que vols buscar: ");
			entradaPerTeclat = sc.nextLine();
			
				if (Cadena.stringIsInt(entradaPerTeclat)) {
					waypointABuscar = Integer.parseInt(entradaPerTeclat);
				} else {
					System.out.println("ERROR: has introduit " + entradaPerTeclat + " com a ruta. Els ID de les rutes són integers.");
					existeixenErrors = true;
				}
		} while (existeixenErrors); 
		
		System.out.println("RUTES QUE CONTENEN EL WAYPOINT "+ entradaPerTeclat + ":");
		
		Set setTmp = comprovacioRendimentTmp.mapaLinkedDeRutes.entrySet();
		Iterator it1 = setTmp.iterator();
        while(it1.hasNext()) {
           Map.Entry me = (Map.Entry)it1.next();
           
           rutaTmp = (Ruta_Dades)me.getValue();
           
           //System.out.println("rutaTmp.getWaypoints(): " + rutaTmp.getWaypoints());
           //System.out.println("rutaTmp.getWaypoints().contains(" + waypointABuscar + "): " + rutaTmp.getWaypoints().contains(waypointABuscar));
           
           if (rutaTmp.getWaypoints().contains(waypointABuscar)) {
        	   System.out.println(rutaTmp);   
           }
        }
	}
	
	
	
	// Esborrar del comprovacioRendimentTmp.mapaLinkedDeRutes les rutes que tinguin un waypoint concret.
	// Intentar esborrar amb un for (no va) i després amb un iterator (sí que va).
	// Només t'has d'assegurar que l'usuari fica un nº.
	// Per a comprovar que ha anat bé, executeu el menú 21 buscant pel waypoint que heu fet servir aquí.
	//32. Esborrar totes les rutes que tinguin un waypoint concret.
	public static void esborrarRutesDelMapAmbUnWaypointConcret(ComprovacioRendiment comprovacioRendimentTmp) {
		boolean existeixenErrors;
		Scanner sc = new Scanner(System.in);
		String entradaPerTeclat = "";
		int waypointABuscar = -1;
		Ruta_Dades rutaTmp;
		
		
		existeixenErrors = true;
		do {
			existeixenErrors = false;
			
			System.out.print("Escriu el nº del waypoint que vols buscar: ");
			entradaPerTeclat = sc.nextLine();
			
				if (Cadena.stringIsInt(entradaPerTeclat)) {
					waypointABuscar = Integer.parseInt(entradaPerTeclat);
				} else {
					System.out.println("ERROR: has introduit " + entradaPerTeclat + " com a waypoint. Els ID dels waypoints són integers.");
					existeixenErrors = true;
				}
		} while (existeixenErrors); 
		
		System.out.println("RUTES ESBORRADES QUE CONTENEN EL WAYPOINT "+ entradaPerTeclat + ":");
		
		Set setTmp = comprovacioRendimentTmp.mapaLinkedDeRutes.entrySet();
		Iterator it1 = setTmp.iterator();
        while(it1.hasNext()) {
           Map.Entry me = (Map.Entry)it1.next();
           
           rutaTmp = (Ruta_Dades)me.getValue();
           
           if (rutaTmp.getWaypoints().contains(waypointABuscar)) {
        	   System.out.println(rutaTmp);   
        	   it1.remove(); 
           }
        }
	}
	
	
	
	//33. Visualitzar les dades d'una ruta
	public static void visualitzarUnaRutaDelMap(ComprovacioRendiment comprovacioRendimentTmp) {
		boolean existeixenErrors;
		Scanner sc = new Scanner(System.in);
		String entradaPerTeclat = "";
		int rutaABuscar = -1;
		
		
		existeixenErrors = true;
		do {
			existeixenErrors = false;
			
			System.out.print("Escriu el ID de la ruta que vols buscar: ");
			entradaPerTeclat = sc.nextLine();
			
				if (Cadena.stringIsInt(entradaPerTeclat)) {
					rutaABuscar = Integer.parseInt(entradaPerTeclat);
				} else {
					System.out.println("ERROR: has introduit " + entradaPerTeclat + " com a ruta. Els ID de les rutes són integers.");
					existeixenErrors = true;
				}
		} while (existeixenErrors); 
		
		if (comprovacioRendimentTmp.mapaLinkedDeRutes.containsKey(rutaABuscar)) {
			System.out.println(comprovacioRendimentTmp.mapaLinkedDeRutes.get(rutaABuscar));
		}
	}
	
	
	
	//34. Ordenar les rutes del MAP per ID
	// S'ha de fer servir un TreeMap.
	// Per defecte ordena per la clau.
	public static void ordenarRutesMapPerID(ComprovacioRendiment comprovacioRendimentTmp) {
		SortedMap<Integer, Ruta_Dades> mapaTreeRutes = new TreeMap<Integer, Ruta_Dades>();
		// Si es declara de tipus TreeMap, a llavors la comanda "mapaTreeRutes.entrySet()" del "for-each" no és acceptada.
		// Per defecte ordena per la clau. ordre natural, ascendent
		
		mapaTreeRutes.putAll(comprovacioRendimentTmp.mapaLinkedDeRutes);
				
		for (Entry<Integer, Ruta_Dades> dada : mapaTreeRutes.entrySet()) {
            System.out.println(dada.getKey() + ": " + dada.getValue().toString());
        }
		
	}
	
	
	
	//35. Ordenar les rutes del MAP per waypoints i ID (el ID de més gran a més petit)
	// Per defecte ordena per la clau. Ara volem que ordeni pel valor, per això farà servir
	// el compareTo() del valor (el de la classe Ruta_Dades).
	//
	// Les Ruta_Dades que tinguin els mateixos waypoints fa que siguin iguals (està definit en el compareTo() de Ruta_Dades) i
	// per tant només hi pot haver 1 en el TreeSet (la 1a que fiquem).
	public static void ordenarRutesMapPerWaypointsAndID(ComprovacioRendiment comprovacioRendimentTmp) {
		SortedMap<Integer, Ruta_Dades> mapaTreeRutes;
		
		mapaTreeRutes = new TreeMap(new comparadorPerWaypointAndID(comprovacioRendimentTmp.mapaLinkedDeRutes));
		
		//mapaTreeRutes = new TreeMap();

		
		mapaTreeRutes.putAll(comprovacioRendimentTmp.mapaLinkedDeRutes);
		
		for (Entry<Integer, Ruta_Dades> dada : mapaTreeRutes.entrySet()) {
            System.out.println(dada.getKey() + ": " + dada.getValue().toString());
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
