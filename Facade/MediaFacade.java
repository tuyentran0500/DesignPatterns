package Facade;

// Facade class to simplify interaction with subsystem
public class MediaFacade {
    private VideoFile videoFile;
    private CodecFactory codecFactory;
    private AudioMixer audioMixer;
    private BufferManager bufferManager;

    public MediaFacade(String filename) {
        this.videoFile = new VideoFile(filename);
        this.codecFactory = new CodecFactory();
        this.audioMixer = new AudioMixer();
        this.bufferManager = new BufferManager();
    }

    // Simplified method to play video
    public void play() {
        bufferManager.loadBuffer();
        codecFactory.decode(videoFile);
        audioMixer.adjustAudio();
        System.out.println("Playing video...");
    }

    // Simplified method to stop video
    public void stop() {
        bufferManager.releaseBuffer();
        System.out.println("Stopping video...");
    }
}
