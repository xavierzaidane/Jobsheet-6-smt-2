package jobsheet;

public class PremiereLeagueService23 {
    
        PremierLeague23[] leagues = new PremierLeague23[20];
        int id = 0;
    
        void add(PremierLeague23 pl) {
            if (id < leagues.length) {
                leagues[id] = pl;
                id++;
            } else {
                System.out.println("List is full");
            }
        }
    
        void displayAll() {
            for (PremierLeague23 premierLeague : leagues) {
                if (premierLeague != null) {
                    premierLeague.print();
                }
            }
        }
    
        void insertionSort(boolean asc) {
            for (int i = 1; i < leagues.length; i++) {
                PremierLeague23 tmp = leagues[i];
                int j = i;
                if (asc) {
                    while (j > 0 && leagues[j - 1].points < tmp.points) {
                        leagues[j] = leagues[j - 1];
                        j--;
                    }
                } else {
                    while (j > 0 && leagues[j - 1].points > tmp.points) {
                        leagues[j] = leagues[j - 1];
                        j--;
                    }
                }
                leagues[j] = tmp;
            }
        }
    }

