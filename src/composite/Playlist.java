package composite;

import java.util.ArrayList;

public class Playlist implements IComponent{

  public String playlistName;
  public ArrayList<IComponent> playlist = new ArrayList();

  public Playlist(String playlistName) {
    this.playlistName = playlistName;
  }

  @Override
  public void play() {
    playlist.forEach(component -> component.play());
  }

  @Override
  public void setPlaybackSpeed(float speed) {
    playlist.forEach(e -> e.setPlaybackSpeed(speed));
  }

  @Override
  public String getName() {
    return this.playlistName;
  }

  public void add(IComponent component){
    playlist.add(component);
  }

  public void remove(IComponent component){
    playlist.remove(component);
  }

}
