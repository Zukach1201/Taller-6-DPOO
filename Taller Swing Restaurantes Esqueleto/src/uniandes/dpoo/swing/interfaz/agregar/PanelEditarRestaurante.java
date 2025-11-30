package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	setLayout(new GridLayout(3,1));
    	
        // Crea el campo para el nombre con una etiqueta al frente
        // TODOC completar
    	JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JLabel nameLabel = new JLabel("Nombre: ");
    	txtNombre = new JTextField();
    	txtNombre.setPreferredSize(new Dimension(200, 25));
    	namePanel.add(nameLabel);
    	namePanel.add(txtNombre);

        // Crea el selector para la calificación con una etiqueta al frente
        // TODOC completar
    	JPanel ratePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JLabel rateLabel = new JLabel("Calificación: ");
    	cbbCalificacion = new JComboBox<String>(new String[] {"1","2","3","4","5"});
    	ratePanel.add(rateLabel);
    	ratePanel.add(cbbCalificacion);
    	
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODOC completar
    	JPanel visitedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    	JLabel visitedLabel = new JLabel("Visitado: ");
    	cbbVisitado = new JComboBox<String>(new String[] {"Si","No"});
    	visitedPanel.add(visitedLabel);
    	visitedPanel.add(cbbVisitado);

        // Agregar todos los elementos al panel
        // TODOC completar
    	add(namePanel);
    	add(ratePanel);
    	add(visitedPanel);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODOC completar
    	String visited = (String)cbbVisitado.getSelectedItem();
    	return visited.equals("Si");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODOC completar
        return txtNombre.getText();
    }
}
