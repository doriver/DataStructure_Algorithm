package array;

public class CustomIntArray01 {
	
	int[] intArr;       // int array
    int count;          // 원소 개수

    public int ARRAY_SIZE; // 배열의 크기
    public static final int ERROR_NUM = -999999999;

    // 디폴트 생성자(크기 10)
    public CustomIntArray01()
    {       
        count = 0; // 요소의 개수
        ARRAY_SIZE = 10; // 배열의 크기
        intArr = new int[ARRAY_SIZE]; // ARRAY_SIZE 만큼 배열 생성
    }

    // size입력받는 생성자
    public CustomIntArray01(int size)
    {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    // 배열의 요소를 추가하는 메소드
    public void addElement(int num)
    {
    	// (원소개수 >= 배열크기) , 꽉찬경우
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }

        // 맨 끝에 값을 넣고 count 1 증가
        intArr[count++] = num;
    }

    // 특정 위치에 요소를 추가하는 메소드
    public void insertElement(int position, int num)
    {
        int i;
        
        // 꽉 찬 경우
        if(count >= ARRAY_SIZE){  
            System.out.println("not enough memory");
            return;
        }

        // index 범위를 넘어가는 경우
        if(position < 0 || position >= ARRAY_SIZE ){
            System.out.println("out of indexRange");
            return;
        }

        for( i = count-1; i >= position ; i--){
            //배열의 제일 끝 부분부터 삽입할 위치(position)까지 1씩 감소하면서
            intArr[i+1]  = intArr[i]; // 하나씩 이동 // [i]에 있는 요소를 [i+1] 에 이동

        }

        //넣고자 하는 위치(position)에 요소 값 넣기
        intArr[position] = num;
        count++; //요소의 수 1 증가
    }

    public int removeElement(int position)
    {
        //특정 위치의 요소를 제거하는 메소드
        int ret = ERROR_NUM;

        //배열이 비어있다면
        if( isEmpty() ){
            System.out.println("There is no element");
            return ret;
        }

        //Index Error 에러 처리 
        if(position < 0 || position >= count ){  //index error
            System.out.println("remove Error");
            return ret;
        }

        //제거할 위치의 요소를 ret 변수에 저장
        ret = intArr[position];


        for(int i = position; i<count -1; i++ )
        {
            //제거할 위치부터 배열의 제일 마지막 위치까지 1씩 증가
            intArr[i] = intArr[i+1]; // 하나씩 이동 // [i+1]에 있는 요소를 [i]에 이동
        }
        count--; //요소의 수 1 감소
        return ret; //삭제된 요소 값 반환
    }

    public int getSize()
    {
        //현재 요소 수 반환
        return count;
    }

    public boolean isEmpty()
    {
        //비어있는지 체크
        if(count == 0){
            return true;
        }
        else return false;
    }

    public int getElement(int position)
    {
        //특정 위치 값으로 요소 수 조회
        if(position < 0 || position > count-1){
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll()
    {
        //모든 요소 출력
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for(int i=0; i<count; i++){
            System.out.println(intArr[i]);
        }

    }

    public void removeAll()
    {
        //배열의 모든 요소 제거
        for(int i=0; i<count; i++){
            intArr[i] = 0;
        }
        count = 0;
    }
}

