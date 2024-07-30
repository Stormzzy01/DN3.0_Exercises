import java.util.Arrays;

public class Search {
    public static Products linearSearch(Products[] products, String productId) {
        for (Products product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public static Products binarySearch(Products[] products, String productId) {
        int l = 0;
        int r = products.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int comp = products[mid].getProductId().compareTo(productId);

            if (comp == 0) {
                return products[mid];
            } else if (comp < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Products[] products = {
            new Products("1", "NVIDIA RTX 3080ti", "Electronics"),
            new Products("2", "AMD Ryzen 7 5700X", "Electronics"),
            new Products("3", "NVIDIA GTX 1660 Super", "Electronics"),
            new Products("4", "Watch", "Accessories"),
            new Products("5", "Table", "Furniture")
        };

        // Ensure the array is sorted for binary search
        Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));

        // Linear search test
        System.out.println("Linear Search:");
        Products result = linearSearch(products, "2");
        System.out.println(result != null ? result : "Product not found");

        // Binary search test
        System.out.println("Binary Search:");
        result = binarySearch(products, "3");
        System.out.println(result != null ? result : "Product not found");
    }
}
