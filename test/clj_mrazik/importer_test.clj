;
;  (C) Copyright 2016  Pavel Tisnovsky
;
;  All rights reserved. This program and the accompanying materials
;  are made available under the terms of the Eclipse Public License v1.0
;  which accompanies this distribution, and is available at
;  http://www.eclipse.org/legal/epl-v10.html
;
;  Contributors:
;      Pavel Tisnovsky
;

(ns clj-mrazik.importer-test
  (:require [clojure.test :refer :all]
            [clj-mrazik.importer :refer :all]))

;
; Common functions used by tests.
;

(defn callable?
    "Test if given function-name is bound to the real function."
    [function-name]
    (clojure.test/function? function-name))

(deftest test-read-csv-existence
    "Check that the clj-mrazik.importer/read-csv definition exists."
    (testing "if the clj-mrazik.importer/read-csv definition exists."
        (is (callable? 'clj-mrazik.importer/read-csv))))


(deftest test-parse-boolean-existence
    "Check that the clj-mrazik.importer/parse-boolean definition exists."
    (testing "if the clj-mrazik.importer/parse-boolean definition exists."
        (is (callable? 'clj-mrazik.importer/parse-boolean))))


(deftest test-parse-use-it-existence
    "Check that the clj-mrazik.importer/parse-use-it definition exists."
    (testing "if the clj-mrazik.importer/parse-use-it definition exists."
        (is (callable? 'clj-mrazik.importer/parse-use-it))))


(deftest test-get-word-class-existence
    "Check that the clj-mrazik.importer/get-word-class definition exists."
    (testing "if the clj-mrazik.importer/get-word-class definition exists."
        (is (callable? 'clj-mrazik.importer/get-word-class))))


(deftest test-get-source-existence
    "Check that the clj-mrazik.importer/get-source definition exists."
    (testing "if the clj-mrazik.importer/get-source definition exists."
        (is (callable? 'clj-mrazik.importer/get-source))))


(deftest test-import-data-existence
    "Check that the clj-mrazik.importer/import-data definition exists."
    (testing "if the clj-mrazik.importer/import-data definition exists."
        (is (callable? 'clj-mrazik.importer/import-data))))
