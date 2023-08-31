import javax.swing.*;  

public class Main {  
    public static void main(String[] args) {  

        // Baum machen
        MorseBaum mb = new MorseBaum();

        int width = 1600;
        int height = 800;
        
        JFrame f = new JFrame();//creating instance of JFrame  

        drawTree(mb.myTree, f, width / 2, 1);

        f.setSize(width,height);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  

    public static void drawTree(BinaryTree<Character> pTree, JFrame f, int xBound, int lvl) {

        JLabel content = new JLabel(String.valueOf(pTree.getContent()));
        content.setBounds(xBound - 50, (lvl * 50) , xBound + 50, (lvl * 50) + 50);
        if (pTree.getLeftTree().getContent() != null) {
            drawTree(pTree.getLeftTree(), f, xBound - (300 / lvl), lvl + 1);
        }
        if (pTree.getRightTree().getContent() != null) {
            drawTree(pTree.getRightTree(), f, xBound + (300 / lvl), lvl + 1);
        }
        f.add(content);

    }

}  
