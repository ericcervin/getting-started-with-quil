(ns getting-started-with-quil.pg168
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            

(defn setup []
  (let [file (slurp "images/ortiz.csv")
        lines (.split file "\n")
        table (map #(.split % ",") lines)]        
       (doseq [row table]
         (let [year (nth row 0)
               home-runs (nth row 1)
               rbi (nth row 2)
               average (nth row 3)]
               
           (println (str year " " home-runs " " rbi " " average))))))


(q/defsketch practice
  :size [100 100]
  :setup setup
  ;;:update update-state
  ;;:draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


