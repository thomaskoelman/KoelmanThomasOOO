package ui;

import domain.Caesar;
import domain.Mirror;
import domain.Text;

import javax.swing.*;

    public static void main(String[] args) {
        String choice = "";
        Text file = new Text("");
        String method = "1";
        while (!choice.equals("0")){
            String menu = "1. choose encryption method\n2. code or decode?\n3. convert!\n\n0. quit";
            choice = JOptionPane.showInputDialog(menu);
            if (choice.equals("1")){
                String number = JOptionPane.showInputDialog("1. Caesar\n2.Mirror");
                if (number.equals("1")){
                    file.changeEncryption(new Caesar());
                } else if(number.equals("2")){
                    file.changeEncryption(new Mirror());
                }
            } else if (choice.equals("2")){
                method = JOptionPane.showInputDialog("1. encrypt\n2. decrypt");
            } else if (choice.equals("3")){
                file.setText(JOptionPane.showInputDialog("Text to encrypt/decrypt:"));
                if (method.equals("1")){
                    JOptionPane.showMessageDialog(null,file.encrypt());
                } else if (method.equals("2")){
                    JOptionPane.showMessageDialog(null,file.decrypt());
                }
            } else if (choice.equals("0")){
                choice = "0";
            }
        }
    }

}
