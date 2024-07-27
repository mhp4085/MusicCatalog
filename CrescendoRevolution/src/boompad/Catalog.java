/**
 * @author Crescendo Revolution Team
 * boompad.catalog class includes information on the catalog page which displays data BoomPad contains
 *
 * Users have the ability to view, sort, search, and filter the catalog from this page.
 * They can also access the account page from this current page.
 * 
 */

package boompad;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the Catalog page of BoomPad which is used for displaying the data
 * that BoomPad contains.
 * Users have the ability to view, sort, search, and filter the catalog from this page.
 * They can also access the account page from this current page.
 *
 * @author hunterhorak
 *
 */
public class Catalog{
	// ============================================================ Properties
	// ============================================================ Constructors

	public JTable musicList;
	/**
	 * The constructor for the GUI.
	 */
	public Catalog() {
		ArrayList<song> songs = boompad.readfile();

		// create frame
		JFrame homePage = new JFrame("BoomPad");
		homePage.setFont(new Font("Dialog", Font.PLAIN, 12));
		homePage.setResizable(false);
		homePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homePage.setSize(800, 800);
		homePage.getContentPane().setLayout(new BorderLayout(0, 0));

		// create panel Homepage Panel
		JPanel panel = new JPanel();
		homePage.getContentPane().add(panel);
		panel.setLayout(null);


		// create label and add to panel
		JLabel boomPad = new JLabel("BoomPad");
		boomPad.setBounds(220, 0, 320, 90);
		boomPad.setHorizontalAlignment(SwingConstants.CENTER);
		boomPad.setFont(new Font("Dialog", Font.PLAIN, 70));
		panel.add(boomPad);

		JTextField searchBar = new JTextField();
		searchBar.setFont(new Font("Dialog", Font.PLAIN, 12));
		searchBar.setBounds(454, 165, 227, 26);
		panel.add(searchBar);
		searchBar.setColumns(10);
		
		createJTable();
		populateJTable();
		musicList.setBounds(32, 709, 729, -478);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<song> searched = new ArrayList<song>();
				for (song s : songs) {
					if (s.toString().toUpperCase().contains(searchBar.getText().toUpperCase())) {
						searched.add(s);
					}
				}
				updateJTable(searched);
			}
		});
		searchButton.setBounds(355, 168, 89, 23);
		panel.add(searchButton);

		// allows users to scroll the catalog
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 215, 561, 438);
		panel.add(scrollPane);

		// displays the data from the catalog
		musicList.setFont(new Font("Dialog", Font.PLAIN, 12));
		scrollPane.setViewportView(musicList);

		// implements a top menu bar
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Dialog", Font.PLAIN, 12));
		homePage.setJMenuBar(menuBar);

		JMenu account = new JMenu("Account"); // allows users to access the account management page
		account.setFont(new Font("Dialog", Font.PLAIN, 12));
		menuBar.add(account);

		JMenu filterMenu = new JMenu("Filter"); // allows users to choose how to filter the catalog
		filterMenu.setFont(new Font("Dialog", Font.PLAIN, 12));
		menuBar.add(filterMenu);


		JMenuItem filterAlbum = new JMenuItem("Album"); // sort by album
		filterAlbum.setFont(new Font("Dialog", Font.PLAIN, 12));
		filterMenu.add(filterAlbum);
		filterAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(searchBar.toString()).equals("")) {
					ArrayList<song> filtered = filter.filterByAlbum(songs, searchBar.getText());
					updateJTable(filtered);
				}
			}
		});

		JMenuItem filterArtist = new JMenuItem("Artist"); // sort by artist
		filterArtist.setFont(new Font("Dialog", Font.PLAIN, 12));
		filterMenu.add(filterArtist);
		filterArtist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(searchBar.toString()).equals("")) {
					ArrayList<song> filtered = filter.filterByArtist(songs, searchBar.getText());
					updateJTable(filtered);
				}
			}
		});


		JMenuItem filterGenre = new JMenuItem("Genre"); // sort by genre
		filterGenre.setFont(new Font("Dialog", Font.PLAIN, 12));
		filterMenu.add(filterGenre);
		filterGenre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(searchBar.toString()).equals("")) {
					ArrayList<song> filtered = filter.filterByGenre(songs, searchBar.getText());
					updateJTable(filtered);
				}
			}
		});

		JMenuItem filterYear = new JMenuItem("Year"); // sort by year
		filterYear.setFont(new Font("Dialog", Font.PLAIN, 12));
		filterMenu.add(filterYear);
		filterYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(searchBar.toString()).equals("")) {
					ArrayList<song> filtered = filter.filterByYear(songs, searchBar.getText());
					updateJTable(filtered);
				}
			}
		});

		JMenu sortMenu = new JMenu("Sort");
		sortMenu.setFont(new Font("Dialog", Font.PLAIN, 12));
		menuBar.add(sortMenu);


		JMenuItem sortAlbum = new JMenuItem("Album");
		sortAlbum.setFont(new Font("Dialog", Font.PLAIN, 12));
		sortMenu.add(sortAlbum);
		sortAlbum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<song> sorted = sortBy.byAlbum(songs);
				updateJTable(sorted);
			}
		});

		JMenuItem sortArtist = new JMenuItem("Artist");
		sortArtist.setFont(new Font("Dialog", Font.PLAIN, 12));
		sortMenu.add(sortArtist);
		sortArtist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<song> sorted = sortBy.byArtist(songs);
				updateJTable(sorted);
			}
		});

		JMenuItem sortGenre = new JMenuItem("Genre");
		sortGenre.setFont(new Font("Dialog", Font.PLAIN, 12));
		sortMenu.add(sortGenre);
		sortGenre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<song> sorted = sortBy.byGenre(songs);
				updateJTable(sorted);
			}
		});

		JMenuItem sortYear = new JMenuItem("Year");
		sortYear.setFont(new Font("Dialog", Font.PLAIN, 12));
		sortMenu.add(sortYear);
		sortYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<song> sorted = sortBy.byYear(songs);
				updateJTable(sorted);
			}
		});


		// set frame
		homePage.setVisible(true);

	}
	// ============================================================ Methods
	// ============================================================ Getters/Setters

	public static void main(String[] args) {
		// Create an instance of the home page GUI
		Catalog catalog = new Catalog();
		// Loop that loads the toString version of songs into JTextArea

	}
	
	public void createJTable() {
		String[] columns = {"Song Title", "ID", "Artist", "Year",
				"Album", "Length", "Producer", "Genre"};
		if (musicList == null)
			musicList = new JTable();
		DefaultTableModel model = (DefaultTableModel) musicList.getModel();
		model.setColumnIdentifiers(columns);
	}
	
	public void populateJTable() {
		ArrayList<song> songs = boompad.readfile();
		DefaultTableModel model = (DefaultTableModel) musicList.getModel();
		model.setRowCount(0);
		for (int i = 0; i < songs.size(); i++) {
			String[] songData = new String[8];
			songData[0] = songs.get(i).getSong_name();
			songData[1] = songs.get(i).getSong_id();
			songData[2] = songs.get(i).getSong_artist();
			songData[3] = songs.get(i).getSong_year();
			songData[4] = songs.get(i).getSong_album();
			songData[5] = songs.get(i).getSong_length();
			songData[6] = songs.get(i).getSong_producer();
			songData[7] = songs.get(i).getSong_genre();
			model.addRow(songData);
		}
		model.fireTableDataChanged();
	}
	
	public void updateJTable(List<song> list) {
		DefaultTableModel model = (DefaultTableModel) musicList.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			String[] songData = new String[8];
			songData[0] = list.get(i).getSong_name();
			songData[1] = list.get(i).getSong_id();
			songData[2] = list.get(i).getSong_artist();
			songData[3] = list.get(i).getSong_year();
			songData[4] = list.get(i).getSong_album();
			songData[5] = list.get(i).getSong_length();
			songData[6] = list.get(i).getSong_producer();
			songData[7] = list.get(i).getSong_genre();
			model.addRow(songData);
		}
		model.fireTableDataChanged();
	}
}
