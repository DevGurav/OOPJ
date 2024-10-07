import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private char currentPlayer;
    private JLabel statusLabel;

    public TicTacToe() {
        // Initialize the game
        currentPlayer = 'X';
        buttons = new JButton[3][3];

        // Set up the frame
        setTitle("Tic-Tac-Toe");
        setSize(400, 400);
        setLayout(new BorderLayout());

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3));

        // Create buttons for the grid
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[row][col].setFocusPainted(false);
                buttons[row][col].addActionListener(this);
                buttonPanel.add(buttons[row][col]);
            }
        }

        // Add components to the frame
        statusLabel = new JLabel("Current Player: X", SwingConstants.CENTER);
        add(statusLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        // Set the clicked button's text to the current player's symbol
        if (clickedButton.getText().equals("") && currentPlayer != '\0') {
            clickedButton.setText(String.valueOf(currentPlayer));
            if (checkForWinner()) {
                statusLabel.setText("Player " + currentPlayer + " wins!");
                currentPlayer = '\0'; // Stop the game
            } else if (isBoardFull()) {
                statusLabel.setText("It's a draw!");
                currentPlayer = '\0'; // Stop the game
            } else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                statusLabel.setText("Current Player: " + currentPlayer);
            }
        }
    }

    private boolean checkForWinner() {
        // Check rows, columns, and diagonals for a winner
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[i][1].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[i][2].getText().equals(String.valueOf(currentPlayer))) {
                return true; // Row
            }
            if (buttons[0][i].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[1][i].getText().equals(String.valueOf(currentPlayer)) &&
                buttons[2][i].getText().equals(String.valueOf(currentPlayer))) {
                return true; // Column
            }
        }
        // Diagonal checks
        if (buttons[0][0].getText().equals(String.valueOf(currentPlayer)) &&
            buttons[1][1].getText().equals(String.valueOf(currentPlayer)) &&
            buttons[2][2].getText().equals(String.valueOf(currentPlayer))) {
            return true; // Main diagonal
        }
        if (buttons[0][2].getText().equals(String.valueOf(currentPlayer)) &&
            buttons[1][1].getText().equals(String.valueOf(currentPlayer)) &&
            buttons[2][0].getText().equals(String.valueOf(currentPlayer))) {
            return true; // Anti-diagonal
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().equals("")) {
                    return false; // Found an empty space
                }
            }
        }
        return true; // No empty spaces
    }

    public static void main(String[] args) {
        // Create the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(TicTacToe::new);
    }
}
