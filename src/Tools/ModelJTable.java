package Tools;

import Entities.Acteur;
import Entities.Cinema;
import Entities.Film;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    // A compléter ici
    public void loadDataCinema(ArrayList<Cinema>desCinema){
        columns = new String[]{"Numéro","Nom"};
        rows = new Object[desCinema.size()][2];
        int i = 0;
        for (Cinema cine: desCinema){
            rows[i][0] = cine.getIdCinema();
            rows[i][1] = cine.getNomCinema();
            i++;
        }
    }
    public void LoadDataFilm(ArrayList<Film>desFilms){
        int j = 0;
        columns = new String[]{"Numéro","Nom","nb Note","unTotal"};
        rows = new Object[desFilms.size()][4];
        for (Film film: desFilms){
            rows[j][0] = film.getIdFilm();
            rows[j][1] = film.getNomFilm();
            rows[j][2] =film.getNbVotes();
            rows[j][3] =film.getTotalVotes();
            j++;
        }

    }
    public  void LoadDataActeurs(ArrayList<Acteur>desActeurs){
        columns = new String[]{"Numéro","Nom","note"};
        rows = new Object[desActeurs.size()][3];
        int i = 0;
        for (Acteur act: desActeurs){
            rows[i][0] = act.getIdActeur();
            rows[i][1] = act.getNomActeur();
            rows[i][2] = act.getNoteActeur();
            i++;
        }
    }

}
