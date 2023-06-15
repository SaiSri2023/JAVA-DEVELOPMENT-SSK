import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumThreads {
        public static final int asize = 100;

        public static final int tcount = 5;

        public static int[] array = new int[asize];
        public static int[] partialSums = new int[tcount];

        public static void main(String[] args) {
            // Fill the array with values from 1 to 100
            for (int i = 0; i < asize; i++) {
                array[i] = i + 1;
            }

            // Create a thread pool with 5 threads
            ExecutorService executor = Executors.newFixedThreadPool(tcount);

            // Calculate partial sums using multiple threads
            for (int i = 0; i < tcount; i++) {
                int startIndex = i * (asize / tcount);
                int endIndex = startIndex + (asize / tcount);

                executor.execute(new PartialSumCalculator(i, startIndex, endIndex));
            }
           executor.shutdown();
            int finalSum = 0;
            for (int sum : partialSums) {
                finalSum += sum;
            }

            System.out.println("Final sum: " + finalSum);
        }

        private static class PartialSumCalculator implements Runnable {
            private int threadId;
            private int startIndex;
            private int endIndex;

            public PartialSumCalculator(int threadId, int startIndex, int endIndex) {
                this.threadId = threadId;
                this.startIndex = startIndex;
                this.endIndex = endIndex;
            }

            @Override
            public void run() {
                int sum = 0;
                for (int i = startIndex; i < endIndex; i++) {
                    sum += array[i];
                }

                partialSums[threadId] = sum;
            }
        }
    }


