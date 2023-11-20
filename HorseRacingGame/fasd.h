#pragma once

void printMap();

void clearWindow();

void addHorsePosition(int  horsePosition[4], int  ranking[4]);

void rankCopy(int  copyRank[4], int  ranking[4]);

void sortArray(int  copyRank[4]);

void printRnak(int  ranking[4], int  copyRank[4]);

void calcRank(int  copyRank[4], int  ranking[4]);

void addHorsesArena(int  horsePosition[4]);

void printHorseLocation();

void stopGame(int  horsePosition[4], int& retflag);

void doGameAlgorithm(int  horsePosition[4], int  ranking[4]);
