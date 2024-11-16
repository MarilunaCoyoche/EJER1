import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoGUI extends JFrame {
    private JPanel mainPanel;
    private JButton btnSaludar;
    private JTextField txtNombre;
    private JLabel lblNombre;
    private JLabel lblResultado;

    public DemoGUI() {
        // Configuración básica de la ventana
        setTitle("Demo GUI - VSCode");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
        // Crear y configurar el panel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Configurar componentes
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);
        btnSaludar = new JButton("Saludar");
        lblResultado = new JLabel("");
        
        // Agregar componentes usando GridBagLayout
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(lblNombre, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(txtNombre, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(btnSaludar, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(lblResultado, gbc);
        
        // Agregar acción al botón
        btnSaludar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                if (!nombre.isEmpty()) {
                    lblResultado.setText("¡Hola, " + nombre + "!");
                } else {
                    lblResultado.setText("Por favor, ingrese un nombre");
                }
            }
        });
        
        // Agregar panel a la ventana
        add(mainPanel);
        
        // Centrar la ventana
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DemoGUI().setVisible(true);
            }
        });
    }
}