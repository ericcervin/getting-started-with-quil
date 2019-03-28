(ns getting-started-with-quil.pg181b
  (:require [quil.core :as q]
            [quil.middleware :as m]
            [clojure.java.io :as io]))

(defn setup []
  (q/background 0 153 204)
  (q/shape-mode :center)
  (let [bot1  (q/load-shape "images/robot1.svg")
        bot2  (q/load-shape "images/robot2.svg")
        bot3  (q/load-shape "images/robot3.svg")
        robots (slurp "images/botnetArmy.tsv")
        robot-table (map #(.split % "\t") (.split robots "\n"))]
    
    (doseq [row robot-table]
       (let [robot-type (nth row 0)
             x    (Float. (nth row 1))
             y    (Float. (nth row 2))
             sc   0.3]
         (condp = robot-type
           "1" (q/shape bot1 x y (* (.width bot1) sc) (* (.height bot1) sc))
           "2" (q/shape bot2 x y (* (.width bot2) sc) (* (.height bot2) sc))
           "3" (q/shape bot3 x y (* (.width bot3) sc) (* (.height bot3) sc)))))))
           


(q/defsketch practice
  :size [720 480]
  :setup setup
  ;;:update update-state
  ;;:draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
