
package sakura;
import javax.swing.JOptionPane;

public class Sakura 
{
    public static void main(String[] args)
    {
        String tomodachi;
        JOptionPane.showMessageDialog(null, "こんにちわ ともだちよ!");
        tomodachi = JOptionPane.showInputDialog(null, "あ！ ちょと...なまえですか");
        JOptionPane.showMessageDialog(null, "そうだね. ごめんごめん! " + tomodachi);
        
    }
    
}
