import javax.swing.*
import java.awt.*
import java.awt.event.*

class ExerciseLoginForm : JFrame("Exercise Login Form"), ActionListener {

    private val usernameLabel = JLabel("Username:")
    private val passwordLabel = JLabel("Password:")
    private val usernameField = JTextField()
    private val passwordField = JPasswordField()
    private val loginButton = JButton("Login")

    init {
        layout = GridLayout(3, 2)
        add(usernameLabel)
        add(usernameField)
        add(passwordLabel)
        add(passwordField)
        add(loginButton)

        loginButton.addActionListener(this)

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(300, 150)
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent) {
        if (e.source === loginButton) {
            val username = usernameField.text
            val password = String(passwordField.password)


            if (username == "admin" && password == "password") {
                JOptionPane.showMessageDialog(this, "Login successful!")
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password")
            }
        }
    }
}

fun main() {
    SwingUtilities.invokeLater { ExerciseLoginForm() }
}
