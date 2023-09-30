
package Controller;


import menu.Menu;
import model.Text;


public class ManagerNumber extends Menu{
      private Text list= new Text();

    public ManagerNumber(String title, String[] s){
        super(title, s);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list.superlativeEquation();
                break;
            case 2:
                list.quadraticEquation();
                break;
            case 3: 
                return;               
        }
    }
}
