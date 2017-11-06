(ns getting-started-with-quil.pg95
  (:require [quil.core :as q]))

            
(defn setup []
  (let [font (q/create-font "/images/SourceCodePro-Regular.ttf" 32)]
       (q/text-font font)
       (q/background 102)
       (q/text-size 32)
       (q/text "That's one small step for man...." 25 60)
       (q/text-size 16)
       (q/text "That's one small step for man...." 27 90)))
      
    
  


    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])
  
