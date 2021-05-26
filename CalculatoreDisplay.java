import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatoreDisplay {
    private JTextField txtNumber1;
    private JButton calculationButton;
    private JTextField txtNumber2;
    private JTextField txtSum;
    private JTextField txtSub;
    private JTextField txtMult;
    private JTextField txtDiv;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatoreDisplay");
        frame.setContentPane(new CalculatoreDisplay().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CalculatoreDisplay() {
        calculationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1,num2,Add,sub;
                float mult,div;
                num1=Integer.parseInt(txtNumber1.getText());
                num2=Integer.parseInt(txtNumber2.getText());
                Add = num1 + num2;
                sub=num1-num2;
                mult=num1*num2;
                txtSum.setText(String.valueOf(Add));
                txtSub.setText(String.valueOf(sub));
                txtMult.setText(String.valueOf(mult));
                div=num1/num2;

                    txtDiv.setText(String.valueOf(div));


            }
        });
    }
}
