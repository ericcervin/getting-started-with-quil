(ns getting-started-with-quil.pg32
  (:require [quil.core :as q]))


(defn setup []
    (q/smooth)
    (q/stroke-weight 2)
    (q/background 0 153 204)
    (q/ellipse-mode :radius)

    ;;Neck
    (q/stroke 255) ;;Set stroke to white
    (q/line 266 257 266 162) ;;Left
    (q/line 276 257 276 162) ;;Middle
    (q/line 286 257 286 162);;RIGHT

    ;;ANTENNAE
    (q/line 270 155 246 112);;SMALL
    (q/line 276 155 306 56);;TALL
    (q/line 276 155 342 170);;MEDIUM

     ;;BODY
    (q/no-stroke);;Disable Stroke
    (q/fill 255 204 0);;set fill to orange
    (q/ellipse 264 377 33 33);;antigravity orb
    (q/fill 0);;Set fill to black

    (q/rect 219 257 90 120);;Main Body
    (q/fill 255 204 0);;set fill to yellow
    (q/rect 219 274 90 6);;Yellow Stripe

    ;;Head
    (q/fill 0);;Set fill to black
    (q/ellipse 276 155 45 45);;Head
    (q/fill 255);;Set fill to white
    (q/ellipse 288 150 14 14);;Large Eye
    (q/fill 0);; Set fill to black
    (q/ellipse 288 150 3 3);; Pupil
    (q/fill 153 204 255);; set fill to light blue
    (q/ellipse 263 148 5 5);; small eye 1
    (q/ellipse 296 130 4 4);;small eye 2
    (q/ellipse 305 162 3 3));;small eye 3  
  
    
(q/defsketch practice
  :size [720 480]
  :setup setup
  :features [:keep-on-top])

