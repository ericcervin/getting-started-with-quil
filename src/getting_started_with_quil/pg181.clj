(ns getting-started-with-quil.pg181
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [clojure.java.io :as io]))




(defn setup []
  (with-open [writer (io/writer "images/botnetArmy.tsv")]
    (doseq [y (range 0 (+ (q/height) 1) 120)]
      (doseq [x (range 0 (+ (q/width) 1) 60)]
       (.write writer (str (+ 1 (rand-int 3)) "\t" x "\t" y "\n"))
       (q/ellipse x y 12 12)))))  
   



(q/defsketch practice
  :size [720 480]
  :setup setup
  ;;:update update-state
  ;;:draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
