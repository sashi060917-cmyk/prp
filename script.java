/* =========================
   BACKGROUND MUSIC
========================= */

document.getElementById('enterButton').addEventListener('click', function() {
  var song = document.getElementById('darkhaast.mp3');
  song.play();
});

function enterWebsite() {

    // The click on this button gives the browser
    // permission to start the music.
    music.volume = 0.45;

    music.play()
        .then(() => {

            // Music successfully started
            musicButton.innerHTML = "Ⅱ";

            // Hide opening screen
            intro.classList.add("hide");

        })
        .catch((error) => {

            console.error("Audio could not start:", error);

            alert(
                "The music was blocked. Please click Enter once more."
            );

        });
}


function toggleMusic() {

    if (music.paused) {

        music.play()
            .then(() => {
                musicButton.innerHTML = "Ⅱ";
            });

    } else {

        music.pause();

        musicButton.innerHTML = "♫";

    }
}


    /*
       Hide the opening screen.
    */

    introScreen.classList.add("hide");

}


/* =========================
   PLAY / PAUSE
========================= */

function toggleMusic() {

    if (backgroundMusic.paused) {

        backgroundMusic.play();

        musicControl.innerHTML = "♫";

    }

    else {

        backgroundMusic.pause();

        musicControl.innerHTML = "Ⅱ";

    }

}