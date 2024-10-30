package Facade;

// Subsystem class for loading video files
class VideoFile {
    private String filename;

    public VideoFile(String filename) {
        this.filename = filename;
        System.out.println("Loading video file: " + filename);
    }
}

// Subsystem class for decoding
class CodecFactory {
    public void decode(VideoFile file) {
        System.out.println("Decoding video file...");
    }
}

// Subsystem class for mixing audio
class AudioMixer {
    public void adjustAudio() {
        System.out.println("Adjusting audio settings...");
    }
}

// Subsystem class for managing buffer
class BufferManager {
    public void loadBuffer() {
        System.out.println("Loading buffer...");
    }

    public void releaseBuffer() {
        System.out.println("Releasing buffer...");
    }
}
